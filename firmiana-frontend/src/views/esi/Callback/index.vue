<script>
export default {
  name: 'Callback',
  data() {
    return {

    }
  },
  mounted() {
    // 在此处处理回调的逻辑，比如获取 URL 中的 code 参数
    const urlParams = new URLSearchParams(window.location.search)
    const code = urlParams.get('code')
    if (code) {
      console.log(code)
      // 发起请求，使用 code 换取 access_token
      // this.$store.dispatch('handleSSOLogin', code)
    }
  }
}
</script>

<template>
  <div>
    <h1>SSO Callback Handling</h1>
    <p>正在处理 EVE SSO 登录回调...</p>
  </div>
</template>

<style scoped lang="scss">

</style>
