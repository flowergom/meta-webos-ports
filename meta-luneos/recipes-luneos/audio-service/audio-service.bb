SUMMARY = "Service interface to control pulseaudio through a ls2 based API."
SECTION = "webos/services"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "luna-service2 json-c glib-2.0 pulseaudio"

PV = "0.1.0-10+git${SRCPV}"
SRCREV = "6c1a2d989ead30ed7aa252b7f480975b2bb3ca3a"

inherit webos_ports_repo
inherit webos_cmake
inherit pkgconfig
inherit webos_system_bus
inherit webos_systemd

WEBOS_GIT_PARAM_BRANCH = "webOS-ports/webOS-OSE"
SRC_URI = "${WEBOS_PORTS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"
