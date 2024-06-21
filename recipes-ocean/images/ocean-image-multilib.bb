# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Philips Ocean Image to validate pacific machines. \
This image contains everything used to test philips machines including GUI, \
demos and lots of applications. This creates a very large image, not \
suitable for production."

require recipes-fsl/images/imx-image-multimedia.bb

#############remove useless config and functions ######
CORE_IMAGE_EXTRA_INSTALL:remove = "packagegroup-imx-isp"
CORE_IMAGE_EXTRA_INSTALL:remove = "packagegroup-imx-security"
CORE_IMAGE_EXTRA_INSTALL:remove = "packagegroup-tools-bluetooth"

####removing tools-testapps is for delete conmman
IMAGE_FEATURES:remove = "tools-testapps"

###########################install 64 lib package ############
CORE_IMAGE_EXTRA_INSTALL += "chromium-ozone-wayland"

IMAGE_INSTALL += "tslib"
IMAGE_INSTALL += "busybox"
IMAGE_INSTALL += "pixman"
IMAGE_INSTALL += "util-linux-libuuid"
IMAGE_INSTALL += "libnl"
IMAGE_INSTALL += "libedit"
IMAGE_INSTALL += "libffi"
IMAGE_INSTALL += "fontconfig"
IMAGE_INSTALL += "boost"
IMAGE_INSTALL += "protobuf"
IMAGE_INSTALL += "libxml2"
IMAGE_INSTALL += "libpng"
IMAGE_INSTALL += "freetype"
IMAGE_INSTALL += "iw"
IMAGE_INSTALL += "cairo"
IMAGE_INSTALL += "libdrm"

### for ocean-ui ###
IMAGE_INSTALL += "ocean-ui"
