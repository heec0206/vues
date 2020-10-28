<template>
  <section class="contensWrap">
    <div class="contensBox">
      <!--
      <article class="list">
        <ul v-if="posts.length">
          <li v-for="(item,index) in posts" :key="index">
            <router-link :to="'posts' + item.No">
              <span class="thumb">
                <img class="cropImg" :src="resolve_url(item.img)"/>
                <span class="cropBox" :style=" 'background-image:url(' + resolve_url(item.img) + ');' "></span>
              </span>
              <span class="info">
                <strong class="tit">{{ item.title }}</strong>
                <span class="txt">{{ item.date }}</span>
              </span>
            </router-link>
          </li>
        </ul>
        <div v-else class="noData">데이터가 없습니다.</div>
      </article>
      -->
      123123123
    </div>
  </section>
</template>
<script>
//import axios from 'axios';

export default {
  data() {
    return {
      datas:[

      ]
    };
  },
  computed: {
    /*
    hasResult: function () {
      return this.posts.length > 0
    }
    */
  },

  created: function(){
      /*
      const baseURI = 'http://localhost:8087';
      axios.get(`${baseURI}/board`,{
        headers:{ }
      })
      .then((result) => {
        this.posts = result.data.data;
        console.log(result.data.data.length);
      })
      */
  },

  methods: {
      /*
      resolve_url:function(path){
        let img = require.context('../assets/images/', false, /\.png$|\.jpg$/);
        return img("./"+path);
      }
      */
  }
};
</script>

<style scoped lang="scss">

</style>
