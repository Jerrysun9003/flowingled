
include conf/distro/include/fsl-imx-preferred-env.inc

DISTRO_NAME = "Philips OCEAN Release Distro"
DISTRO_VERSION = "6.1-ocean"
DISTROOVERRIDES = "ocean"

# define the virtual/bootloader is u-boot-ocean
PREFERRED_PROVIDER_virtual/bootloader:imx-nxp-bsp = "u-boot-ocean"

# define the virtual/kernel is linux-ocean
PREFERRED_PROVIDER_virtual/kernel:imx-nxp-bsp = "linux-ocean"
