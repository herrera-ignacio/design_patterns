# State

Also known as __Surrogate__.

### Intent

Provide a placeholder for another object to control access to it.

### Applicability

Proxy is applicable whenever there is a need for a more versatile reference to an object than a simple pointer.
* __Remote proxy__ provides a local representative for an object in a different address space.
* __Virtual proxy__ creates expensive objects on demand.
* __Protection proxy__ controls access to the original object (useful for objects with different access rights).
* __Smart reference__ is a replacement for a bare pointer that performs additional actions to operating system objects.
    * Counting number of references to the real object so that it can be freed automatically (_Smart Pointers_).
    * Loading a persistent object into memory when it's first referenced.
    * Checking that the real object is locked before it's accessed to ensure immutability.

### Motivation

One reason for controlling access to an object is to defer the full cost of its creation and initialization until we actually need to use it. Consider a document editor that can embed graphical objects in a document. Some graphical objects, like large raster images, can be expensive to create. But opening a document should be fast, so we should avoid creating all the expensive objects at once when the document is opened. This isn't necessary anyway, because not all of these objects will be visible in the document at the same time.

These constraints would suggest creating each expensive object on demand, which in this case occurs when an image becomes visible. But what do we put in the document in place of the image? And how can we hide the fact that the image is created on demand so that we don't complicate the editor's implementation? This optimization shouldn't impact the rendering and formatting code, for example.

The solution is to use another object, an image proxy, that acts as a stand-in for the real image. The proxy acts just like the image and takes care of instantiating it when it's required.

![proxy example](./proxy-example.png)

The image proxy creates the real image only when the document editor asks it to display itself by invoking its Draw operation. The proxy forwards subsequent requests directly to the image. It must therefore keep a reference to the image after creating it.

Let's assume that images are stored in separate files. In this case we can use the file name as the reference to the real object. The proxy also stores its extent, that is, its width and height. The extent lets the proxy respond to requests for its size from the formatter without actually instantiating the image.

![proxy example 2](./proxy-example-2.png)

### Structure

![proxy structure](./proxy-structure.png)

![proxy sharing](./proxy-structure-2.png)

### Consequences

1. Proxy introduces a level of indirection when accessing an object. Depending on the type of Proxy the indirection has many uses.
    * Remote proxy can hide the fact that an object resides in a different address space.
    * Virtual proxy can perform optimizations such as creating object on demand.
    * Both Protection proxy and Smart references allow additional housekeeping tasks when an object is accessed.
2. Optimizations like __Copy-on-Write__ can be hidden from the client. Copying a large and complicated object can be an expensive operation. If the copy is never modified then there's no need to incur this cost. By using a proxy to postpone the copying process, we ensure that we pay the price of copying the objecto nly if it's modified.