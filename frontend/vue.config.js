 module.exports = {
  devServer: { overlay: false },
  chainWebpack(config) {
    config.devtool('source-map')
  },
  css: {
    sourceMap : true,
  },
  outputDir:'../src/main/resources/static',
  publicPath: process.env.NODE_ENV === 'production'
      ? '/'
      : '/'
}
