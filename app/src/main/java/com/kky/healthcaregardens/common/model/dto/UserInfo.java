package com.kky.healthcaregardens.common.model.dto;

import java.util.List;

public class UserInfo {


    /**
     * code : 0
     * msg : null
     * data : {"records":[{"id":"53a2375a1d284f4b8be1d4ff9e5a9baf","deviceId":null,"sysUserId":"8838651ff6abe886ecf610b7c2b00df1","headImg":null,"nickname":null,"age":20,"birthday":null,"sex":1,"phone":"13627494495","height":1245,"weight":1212,"latelyUse":1,"realName":"121","residenceAddress":"12","userName":null,"telephone":null,"provinceId":null,"province":null,"cityId":null,"city":null,"areaId":null,"area":null,"detailAddress":null,"isScan":null,"isDel":null,"updateTime":"2019-01-06 11:32:57","createTime":"2019-01-06 11:32:57"}],"total":1,"size":10,"current":1,"orders":[],"searchCount":true,"pages":1}
     * ok : true
     */

    private int code;
    private Object msg;
    private DataBean data;
    private boolean ok;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public static class DataBean {
        /**
         * records : [{"id":"53a2375a1d284f4b8be1d4ff9e5a9baf","deviceId":null,"sysUserId":"8838651ff6abe886ecf610b7c2b00df1","headImg":null,"nickname":null,"age":20,"birthday":null,"sex":1,"phone":"13627494495","height":1245,"weight":1212,"latelyUse":1,"realName":"121","residenceAddress":"12","userName":null,"telephone":null,"provinceId":null,"province":null,"cityId":null,"city":null,"areaId":null,"area":null,"detailAddress":null,"isScan":null,"isDel":null,"updateTime":"2019-01-06 11:32:57","createTime":"2019-01-06 11:32:57"}]
         * total : 1
         * size : 10
         * current : 1
         * orders : []
         * searchCount : true
         * pages : 1
         */

        private int total;
        private int size;
        private int current;
        private boolean searchCount;
        private int pages;
        private List<RecordsBean> records;
        private List<?> orders;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public boolean isSearchCount() {
            return searchCount;
        }

        public void setSearchCount(boolean searchCount) {
            this.searchCount = searchCount;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public List<RecordsBean> getRecords() {
            return records;
        }

        public void setRecords(List<RecordsBean> records) {
            this.records = records;
        }

        public List<?> getOrders() {
            return orders;
        }

        public void setOrders(List<?> orders) {
            this.orders = orders;
        }

        public static class RecordsBean {
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
            private Integer deviceId;
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
            private Integer provinceId;
            private String province;
            private Integer cityId;
            private String city;
            private Integer areaId;
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

            public Integer getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(Integer deviceId) {
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

            public Integer getProvinceId() {
                return provinceId;
            }

            public void setProvinceId(Integer provinceId) {
                this.provinceId = provinceId;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public Integer getCityId() {
                return cityId;
            }

            public void setCityId(Integer cityId) {
                this.cityId = cityId;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public Integer getAreaId() {
                return areaId;
            }

            public void setAreaId(Integer areaId) {
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

            public int getIsScan() {
                return isScan;
            }

            public void setIsScan(int isScan) {
                this.isScan = isScan;
            }

            public int getIsDel() {
                return isDel;
            }

            public void setIsDel(int isDel) {
                this.isDel = isDel;
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
        }
    }
}
