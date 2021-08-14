package com.springrest.springrest.entities;

public class Course {
	
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private long noOfTrucks;
	private long weight;
	private long shipperId;
	public Course(String loadingPoint, String unloadingPoint, String productType, String truckType, long noOfTrucks,
			long weight, long shipperId) {
		super();
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipperId = shipperId;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public long getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(long noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}
	@Override
	public String toString() {
		return "Course [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", shipperId=" + shipperId + ", getLoadingPoint()=" + getLoadingPoint() + ", getUnloadingPoint()="
				+ getUnloadingPoint() + ", getProductType()=" + getProductType() + ", getTruckType()=" + getTruckType()
				+ ", getNoOfTrucks()=" + getNoOfTrucks() + ", getWeight()=" + getWeight() + ", getShipperId()="
				+ getShipperId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
