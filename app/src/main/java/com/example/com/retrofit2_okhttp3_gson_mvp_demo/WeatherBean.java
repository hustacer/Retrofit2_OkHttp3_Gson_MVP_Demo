package com.example.com.retrofit2_okhttp3_gson_mvp_demo;

import java.util.List;

public class WeatherBean {
    /**
     * time : 2019-05-30 15:53:31
     * cityInfo : {"city":"天津市","cityId":"101030100","parent":"天津","updateTime":"15:30"}
     * date : 20190530
     * message : Success !
     * status : 200
     * data : {"shidu":"25%","pm25":24,"pm10":64,"quality":"良","wendu":"28","ganmao":"极少数敏感人群应减少户外活动","yesterday":{"date":"29","sunrise":"04:50","high":"高温 33.0℃","low":"低温 23.0℃","sunset":"19:28","aqi":80,"ymd":"2019-05-29","week":"星期三","fx":"西南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},"forecast":[{"date":"30","sunrise":"04:49","high":"高温 29.0℃","low":"低温 17.0℃","sunset":"19:29","aqi":62,"ymd":"2019-05-30","week":"星期四","fx":"东北风","fl":"3-4级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"31","sunrise":"04:49","high":"高温 30.0℃","low":"低温 19.0℃","sunset":"19:29","aqi":41,"ymd":"2019-05-31","week":"星期五","fx":"西南风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"01","sunrise":"04:48","high":"高温 32.0℃","low":"低温 22.0℃","sunset":"19:30","aqi":96,"ymd":"2019-06-01","week":"星期六","fx":"东南风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"02","sunrise":"04:48","high":"高温 36.0℃","low":"低温 25.0℃","sunset":"19:31","aqi":116,"ymd":"2019-06-02","week":"星期日","fx":"西南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"03","sunrise":"04:47","high":"高温 33.0℃","low":"低温 22.0℃","sunset":"19:31","aqi":96,"ymd":"2019-06-03","week":"星期一","fx":"东北风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"04","sunrise":"04:47","high":"高温 30.0℃","low":"低温 21.0℃","sunset":"19:32","aqi":126,"ymd":"2019-06-04","week":"星期二","fx":"东南风","fl":"3-4级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"05","sunrise":"04:46","high":"高温 31.0℃","low":"低温 22.0℃","sunset":"19:33","ymd":"2019-06-05","week":"星期三","fx":"北风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"06","sunrise":"04:46","high":"高温 36.0℃","low":"低温 25.0℃","sunset":"19:33","ymd":"2019-06-06","week":"星期四","fx":"西北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"07","sunrise":"04:46","high":"高温 36.0℃","low":"低温 22.0℃","sunset":"19:34","ymd":"2019-06-07","week":"星期五","fx":"西北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"08","sunrise":"04:46","high":"高温 31.0℃","low":"低温 23.0℃","sunset":"19:35","ymd":"2019-06-08","week":"星期六","fx":"西北风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"09","sunrise":"04:45","high":"高温 34.0℃","low":"低温 24.0℃","sunset":"19:35","ymd":"2019-06-09","week":"星期日","fx":"东南风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"10","sunrise":"04:45","high":"高温 36.0℃","low":"低温 23.0℃","sunset":"19:36","ymd":"2019-06-10","week":"星期一","fx":"东风","fl":"4-5级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"11","sunrise":"04:45","high":"高温 30.0℃","low":"低温 20.0℃","sunset":"19:36","ymd":"2019-06-11","week":"星期二","fx":"东风","fl":"4-5级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"12","sunrise":"04:45","high":"高温 32.0℃","low":"低温 22.0℃","sunset":"19:37","ymd":"2019-06-12","week":"星期三","fx":"东南风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"13","sunrise":"04:45","high":"高温 31.0℃","low":"低温 21.0℃","sunset":"19:37","ymd":"2019-06-13","week":"星期四","fx":"东南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"}]}
     */

    private String time;
    private CityInfoBean cityInfo;
    private String date;
    private String message;
    private int status;
    private DataBean data;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CityInfoBean getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfoBean cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class CityInfoBean {
        /**
         * city : 天津市
         * cityId : 101030100
         * parent : 天津
         * updateTime : 15:30
         */

        private String city;
        private String cityId;
        private String parent;
        private String updateTime;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }

    public static class DataBean {
        /**
         * shidu : 25%
         * pm25 : 24.0
         * pm10 : 64.0
         * quality : 良
         * wendu : 28
         * ganmao : 极少数敏感人群应减少户外活动
         * yesterday : {"date":"29","sunrise":"04:50","high":"高温 33.0℃","low":"低温 23.0℃","sunset":"19:28","aqi":80,"ymd":"2019-05-29","week":"星期三","fx":"西南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"}
         * forecast : [{"date":"30","sunrise":"04:49","high":"高温 29.0℃","low":"低温 17.0℃","sunset":"19:29","aqi":62,"ymd":"2019-05-30","week":"星期四","fx":"东北风","fl":"3-4级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"31","sunrise":"04:49","high":"高温 30.0℃","low":"低温 19.0℃","sunset":"19:29","aqi":41,"ymd":"2019-05-31","week":"星期五","fx":"西南风","fl":"<3级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"01","sunrise":"04:48","high":"高温 32.0℃","low":"低温 22.0℃","sunset":"19:30","aqi":96,"ymd":"2019-06-01","week":"星期六","fx":"东南风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"02","sunrise":"04:48","high":"高温 36.0℃","low":"低温 25.0℃","sunset":"19:31","aqi":116,"ymd":"2019-06-02","week":"星期日","fx":"西南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"03","sunrise":"04:47","high":"高温 33.0℃","low":"低温 22.0℃","sunset":"19:31","aqi":96,"ymd":"2019-06-03","week":"星期一","fx":"东北风","fl":"3-4级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"04","sunrise":"04:47","high":"高温 30.0℃","low":"低温 21.0℃","sunset":"19:32","aqi":126,"ymd":"2019-06-04","week":"星期二","fx":"东南风","fl":"3-4级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"05","sunrise":"04:46","high":"高温 31.0℃","low":"低温 22.0℃","sunset":"19:33","ymd":"2019-06-05","week":"星期三","fx":"北风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"06","sunrise":"04:46","high":"高温 36.0℃","low":"低温 25.0℃","sunset":"19:33","ymd":"2019-06-06","week":"星期四","fx":"西北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"07","sunrise":"04:46","high":"高温 36.0℃","low":"低温 22.0℃","sunset":"19:34","ymd":"2019-06-07","week":"星期五","fx":"西北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"08","sunrise":"04:46","high":"高温 31.0℃","low":"低温 23.0℃","sunset":"19:35","ymd":"2019-06-08","week":"星期六","fx":"西北风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"09","sunrise":"04:45","high":"高温 34.0℃","low":"低温 24.0℃","sunset":"19:35","ymd":"2019-06-09","week":"星期日","fx":"东南风","fl":"<3级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"10","sunrise":"04:45","high":"高温 36.0℃","low":"低温 23.0℃","sunset":"19:36","ymd":"2019-06-10","week":"星期一","fx":"东风","fl":"4-5级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"11","sunrise":"04:45","high":"高温 30.0℃","low":"低温 20.0℃","sunset":"19:36","ymd":"2019-06-11","week":"星期二","fx":"东风","fl":"4-5级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"12","sunrise":"04:45","high":"高温 32.0℃","low":"低温 22.0℃","sunset":"19:37","ymd":"2019-06-12","week":"星期三","fx":"东南风","fl":"<3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"13","sunrise":"04:45","high":"高温 31.0℃","low":"低温 21.0℃","sunset":"19:37","ymd":"2019-06-13","week":"星期四","fx":"东南风","fl":"3-4级","type":"晴","notice":"愿你拥有比阳光明媚的心情"}]
         */

        private String shidu;
        private double pm25;
        private double pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public double getPm25() {
            return pm25;
        }

        public void setPm25(double pm25) {
            this.pm25 = pm25;
        }

        public double getPm10() {
            return pm10;
        }

        public void setPm10(double pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 29
             * sunrise : 04:50
             * high : 高温 33.0℃
             * low : 低温 23.0℃
             * sunset : 19:28
             * aqi : 80.0
             * ymd : 2019-05-29
             * week : 星期三
             * fx : 西南风
             * fl : 3-4级
             * type : 晴
             * notice : 愿你拥有比阳光明媚的心情
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String ymd;
            private String week;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getYmd() {
                return ymd;
            }

            public void setYmd(String ymd) {
                this.ymd = ymd;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }

        public static class ForecastBean {
            /**
             * date : 30
             * sunrise : 04:49
             * high : 高温 29.0℃
             * low : 低温 17.0℃
             * sunset : 19:29
             * aqi : 62.0
             * ymd : 2019-05-30
             * week : 星期四
             * fx : 东北风
             * fl : 3-4级
             * type : 阴
             * notice : 不要被阴云遮挡住好心情
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String ymd;
            private String week;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getYmd() {
                return ymd;
            }

            public void setYmd(String ymd) {
                this.ymd = ymd;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }
}
