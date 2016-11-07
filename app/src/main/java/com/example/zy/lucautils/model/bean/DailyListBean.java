package com.example.zy.lucautils.model.bean;

import java.util.List;

/**
 * Created by dell on 2016/11/7.
 */

public class DailyListBean {
    /**
     * date : 20161107
     * stories : [{"images":["http://pic2.zhimg.com/741cfbbed0018bac98ffd44c3472b219.jpg"],"type":0,"id":8956912,"ga_prefix":"110715","title":"你是独自生活的「空巢青年」吗？"},{"images":["http://pic3.zhimg.com/1cc80a85b3545b2833a920a093270102.jpg"],"type":0,"id":8956658,"ga_prefix":"110714","title":"喝酒能尝出橡木桶的味道，道理和茶叶蛋差不多"},{"images":["http://pic2.zhimg.com/608319503a3e9391cd34b0e4fb5a1fbd.jpg"],"type":0,"id":8949413,"ga_prefix":"110713","title":"莎士比亚虚掩了一扇门，走进去，是个绚烂多彩的情色世界"},{"images":["http://pic1.zhimg.com/50235d656ceb979f5f77fe2b5a797dec.jpg"],"type":0,"id":8955955,"ga_prefix":"110712","title":"大误 · 你对天线宝宝一无所知"},{"title":"火车不再「咣当咣当」，因为铁轨都变「无缝」了","ga_prefix":"110711","images":["http://pic3.zhimg.com/382e5dc02910f4a0afff6e03ba1f4d5e.jpg"],"multipic":true,"type":0,"id":8955739},{"images":["http://pic3.zhimg.com/f522d68adeaa2b5d219d1e8fd8a6c166.jpg"],"type":0,"id":8955549,"ga_prefix":"110710","title":"国外名校的申请书一点套路都不给，这是逼我聊人生啊"},{"images":["http://pic4.zhimg.com/9d9f506a76eac62ce14602c82a5e7c53.jpg"],"type":0,"id":8955282,"ga_prefix":"110709","title":"「酸碱体质」不靠谱，但食物的酸碱性值得捋一捋"},{"images":["http://pic4.zhimg.com/2ec7facf5b08c3a8748650192c317fef.jpg"],"type":0,"id":8955123,"ga_prefix":"110708","title":"觉得「看见了」，其实「没看见」"},{"images":["http://pic3.zhimg.com/91a6a156bd3e2d7eb08d2e641ec9e4b6.jpg"],"type":0,"id":8955674,"ga_prefix":"110707","title":"哪些宏观经济学现象有精彩而出乎意料的微观基础？"},{"title":"只能想到拍拍照片视频，你也太小看无人机了","ga_prefix":"110707","images":["http://pic4.zhimg.com/6de71c4db1e2c063ab75d047251579f3.jpg"],"multipic":true,"type":0,"id":8955536},{"images":["http://pic1.zhimg.com/f75c220fc79a497f9d493efab2736394.jpg"],"type":0,"id":8955649,"ga_prefix":"110707","title":"「要是老师长得好看，我也不至于成为学渣啊」"},{"images":["http://pic4.zhimg.com/d592e063dfcc40069a28b6f554b51283.jpg"],"type":0,"id":8955516,"ga_prefix":"110707","title":"读读日报 24 小时热门 TOP 5 · 老司机黄阿丽"},{"images":["http://pic4.zhimg.com/831a9880abd57524040e0aedc1a748bf.jpg"],"type":0,"id":8949380,"ga_prefix":"110706","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"http://pic3.zhimg.com/40f045bfe671402d369fd3dc12b8abca.jpg","type":0,"id":8956912,"ga_prefix":"110715","title":"你是独自生活的「空巢青年」吗？"},{"image":"http://pic3.zhimg.com/6884e44f785190d358c8fe7891df1622.jpg","type":0,"id":8955649,"ga_prefix":"110707","title":"「要是老师长得好看，我也不至于成为学渣啊」"},{"image":"http://pic3.zhimg.com/feff3c9f71cb252d6de3c544d73df7a2.jpg","type":0,"id":8955282,"ga_prefix":"110709","title":"「酸碱体质」不靠谱，但食物的酸碱性值得捋一捋"},{"image":"http://pic1.zhimg.com/7671127d1930e20fe319190e6f0202f4.jpg","type":0,"id":8955516,"ga_prefix":"110707","title":"读读日报 24 小时热门 TOP 5 · 老司机黄阿丽"},{"image":"http://pic3.zhimg.com/7766a061e3374ca2f498f6ed589e105e.jpg","type":0,"id":8942755,"ga_prefix":"110306","title":"这里是广告 · 斜杠青年的进阶，是斜杠中年还是高级玩家？"}]
     */

    private String date;
    /**
     * images : ["http://pic2.zhimg.com/741cfbbed0018bac98ffd44c3472b219.jpg"]
     * type : 0
     * id : 8956912
     * ga_prefix : 110715
     * title : 你是独自生活的「空巢青年」吗？
     */

    private List<StoriesEntity> stories;
    /**
     * image : http://pic3.zhimg.com/40f045bfe671402d369fd3dc12b8abca.jpg
     * type : 0
     * id : 8956912
     * ga_prefix : 110715
     * title : 你是独自生活的「空巢青年」吗？
     */

    private List<TopStoriesEntity> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public List<TopStoriesEntity> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesEntity> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesEntity {
        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesEntity {
        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
