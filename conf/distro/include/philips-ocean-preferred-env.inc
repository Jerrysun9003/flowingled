
include conf/distro/include/fsl-imx-preferred-env.inc

DISTRO_NAME = "Philips OCEAN Release Distro"
DISTRO_VERSION = "0.2.1.0"
DISTROOVERRIDES = "ocean"

# define the virtual/bootloader is u-boot-ocean
PREFERRED_PROVIDER_virtual/bootloader:imx-nxp-bsp = "u-boot-ocean"

# define the virtual/kernel is linux-ocean
PREFERRED_PROVIDER_linux-imx-mfgtool:remove = "linux-imx-mfgtool"
PREFERRED_PROVIDER_virtual/kernel:imx-nxp-bsp = "linux-ocean"
