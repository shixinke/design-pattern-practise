package com.shixinke.practise.design.pattern.content.creation.prototype.deep;

/**
 * 用户收货地址
 * @author shixinke
 */
public class Address implements Cloneable {
    /**
     * 地址ID
     */
    private Long addressId;

    /**
     * 收货详细地址
     */
    private String address;

    public Address(Long addressId, String address) {
        this.addressId = addressId;
        this.address = address;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 重写clone方法
     * @return
     */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
