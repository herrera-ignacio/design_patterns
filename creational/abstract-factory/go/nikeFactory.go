package main

type nikeFactory struct {
}

func (n *nikeFactory) makeShoe() iShoe {
	return &nikeShoe{
		shoe{
			logo: "nike",
			size: 14,
		},
	}
}

func (n *nikeFactory) makeShirt() iShirt {
	return &nikeShirt{
		shirt{
			logo: "nike",
			size: 14,
		},
	}
}
