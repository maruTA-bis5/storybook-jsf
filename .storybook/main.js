module.exports = {
  "stories": [
    "../stories/**/*.stories.json"
  ],
  "addons": [
    "@storybook/addon-links",
    "@storybook/addon-essentials",
    "@storybook/server"
  ],
  webpackFinal: async (config, {configType}) => {
    config.module.rules.push({
      test: /\.xhtml$/,
      use: ['html-loader']
    });

    return config;
  }
}
