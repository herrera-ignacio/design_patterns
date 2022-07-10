package main

import "fmt"

type iSportsFactory interface {
	makeShoe() iShoe
	makeShirt() iShirt
}

func getSportsFactory(brand string) (iSportsFactory, error) {
	if brand == "adidas" {
		return &adidasFactory{}, nil
	}

	if brand == "nike" {
		return &nikeFactory{}, nil
	}

	return nil, fmt.Errorf("Wrong brand type passed")
}
