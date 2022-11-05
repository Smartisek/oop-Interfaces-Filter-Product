package org.example;

// The matches() method matches two Products.
// filterBy() is passed in an IProductFilter object that implements the IProductFilter interface, and
// thus has a filterBy() method.
// Because of this setup, we can create a filter and apply the filter to the ProductContainer
// without having to add code in the ProductContainer class.

// Later we can generalize this interface to deal with objects of any type.

// Note the "I" means "Interface", and is sometimes used to help identify Interface types,
// however, it is not a requirement.

public interface IFilter_Product
{
	boolean matches(Product product);
}
