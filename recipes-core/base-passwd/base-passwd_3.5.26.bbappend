# Same as in base recipe but dropped the nobash.patch
SRC_URI = "${DEBIAN_MIRROR}/main/b/base-passwd/base-passwd_${PV}.tar.gz \
           file://add_shutdown.patch \
           file://input.patch"
