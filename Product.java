package com.apl;

public class Product {
	
	static String productSku = "PROD-9988X";
	static double retailPrice = 599.99;
	static int inventoryStockCount = 1500;
	static boolean isAvailableForSale = true;
	static char warehouseSectioCode = 'W';
	static byte safetyWarningAgeLimit;
	static byte productReviewRatingStars;
	static short physicalWeightGrams = 5;
	static short manufactureingDaysLimit;
	static int uniqueBarcodeEan = 345;
	static long globalBarcodeEan;
	static long totalUnitsSoldLifetime;
	static float productBoxWidthInches= 34.87f;
	static float internalProductVersion;
	static String manufactureCountryName = "USA";
	
	public static void main(String[] args) {
		
		System.out.println("ProductSku is "+ productSku);
		System.out.println("retailPrice is "+ retailPrice);
		System.out.println("Inventory Stock Count is "+ inventoryStockCount);
		System.out.println("Stock is available for sale is "+ isAvailableForSale);
		System.out.println("Ware House section code  is "+ warehouseSectioCode);
		System.out.println("Safety warning age limit is "+ safetyWarningAgeLimit);
		System.out.println("Product review rating star is "+ productReviewRatingStars);
		System.out.println("Physical Weight gram is "+ physicalWeightGrams);
		System.out.println("Manufactureing Days Limit "+ manufactureingDaysLimit);
		System.out.println("Unique Bar code ean is "+ uniqueBarcodeEan);
		System.out.println("Global Bar code Ean is "+ globalBarcodeEan);
		System.out.println("Total Units Sold life time is "+ totalUnitsSoldLifetime);
		System.out.println("Product bax Weigh Inches is "+ productBoxWidthInches);
		System.out.println("Internal Product Version is "+ internalProductVersion);
		System.out.println("Manufacture country name is "+ manufactureCountryName);
	}
}
