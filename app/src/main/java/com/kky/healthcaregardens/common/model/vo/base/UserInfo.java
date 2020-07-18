package com.kky.healthcaregardens.common.model.vo.base;

public class UserInfo {


    /**
     * id : 53a2375a1d284f4b8be1d4ff9e5a9baf
     * deviceId : null
     * sysUserId : 8838651ff6abe886ecf610b7c2b00df1
     * headImg : null
     * nickname : null
     * age : 20
     * birthday : null
     * sex : 1
     * phone : 13627494495
     * height : 1245
     * weight : 1212
     * latelyUse : 1
     * realName : 121
     * residenceAddress : 12
     * userName : null
     * telephone : null
     * provinceId : null
     * province : null
     * cityId : null
     * city : null
     * areaId : null
     * area : null
     * detailAddress : null
     * isScan : null
     * isDel : null
     * updateTime : 2019-01-06 11:32:57
     * createTime : 2019-01-06 11:32:57
     */

    private String id;
    private int deviceId;
    private String sysUserId;
    private String headImg;
    private String nickname;
    private int age;
    private String birthday;
    private int sex;
    private String phone;
    private int height;
    private int weight;
    private int latelyUse;
    private String realName;
    private String residenceAddress;
    private String userName;
    private String telephone;
    private long provinceId;
    private String province;
    private long cityId;
    private String city;
    private long areaId;
    private String area;
    private String detailAddress;
    private int isScan;
    private int isDel;
    private String updateTime;
    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLatelyUse() {
        return latelyUse;
    }

    public void setLatelyUse(int latelyUse) {
        this.latelyUse = latelyUse;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public int isScan() {
        return isScan;
    }

    public void setScan(int scan) {
        isScan = scan;
    }

    public int isDel() {
        return isDel;
    }

    public void setDel(int del) {
        isDel = del;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", sysUserId='" + sysUserId + '\'' +
                ", headImg='" + headImg + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", latelyUse=" + latelyUse +
                ", realName='" + realName + '\'' +
                ", residenceAddress='" + residenceAddress + '\'' +
                ", userName='" + userName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", provinceId=" + provinceId +
                ", province='" + province + '\'' +
                ", cityId=" + cityId +
                ", city='" + city + '\'' +
                ", areaId=" + areaId +
                ", area='" + area + '\'' +
                ", detailAddress='" + detailAddress + '\'' +
                ", isScan=" + isScan +
                ", isDel=" + isDel +
                ", updateTime='" + updateTime + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
