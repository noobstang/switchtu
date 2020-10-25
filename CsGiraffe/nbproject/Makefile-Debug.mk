#
# Generated Makefile - do not edit!
#
# Edit the Makefile in the project folder instead (../Makefile). Each target
# has a -pre and a -post target defined where you can add customized code.
#
# This makefile implements configuration specific macros and targets.


# Environment
MKDIR=mkdir
CP=cp
GREP=grep
NM=nm
CCADMIN=CCadmin
RANLIB=ranlib
CC=gcc
CCC=g++
CXX=g++
FC=gfortran
AS=as

# Macros
CND_PLATFORM=GNU-Linux
CND_DLIB_EXT=so
CND_CONF=Debug
CND_DISTDIR=dist
CND_BUILDDIR=build

# Include project Makefile
include Makefile

# Object Directory
OBJECTDIR=${CND_BUILDDIR}/${CND_CONF}/${CND_PLATFORM}

# Object Files
OBJECTFILES= \
	${OBJECTDIR}/2darray_nested.o \
	${OBJECTDIR}/arrays_test.o \
	${OBJECTDIR}/better_calculator.o \
	${OBJECTDIR}/calculator.o \
	${OBJECTDIR}/comments.o \
	${OBJECTDIR}/constants.o \
	${OBJECTDIR}/for_loop.o \
	${OBJECTDIR}/functions.o \
	${OBJECTDIR}/functions_return.o \
	${OBJECTDIR}/guessing_game.o \
	${OBJECTDIR}/hworld.o \
	${OBJECTDIR}/if_statement.o \
	${OBJECTDIR}/input.o \
	${OBJECTDIR}/mad_libs.o \
	${OBJECTDIR}/memory_address.o \
	${OBJECTDIR}/number_fn.o \
	${OBJECTDIR}/pointer_deref.o \
	${OBJECTDIR}/pointers.o \
	${OBJECTDIR}/primitivetype.o \
	${OBJECTDIR}/printf_test.o \
	${OBJECTDIR}/read.o \
	${OBJECTDIR}/shortstory.o \
	${OBJECTDIR}/structs.o \
	${OBJECTDIR}/switch_statement.o \
	${OBJECTDIR}/while_loop.o \
	${OBJECTDIR}/write.o


# C Compiler Flags
CFLAGS=

# CC Compiler Flags
CCFLAGS=
CXXFLAGS=

# Fortran Compiler Flags
FFLAGS=

# Assembler Flags
ASFLAGS=

# Link Libraries and Options
LDLIBSOPTIONS=

# Build Targets
.build-conf: ${BUILD_SUBPROJECTS}
	"${MAKE}"  -f nbproject/Makefile-${CND_CONF}.mk ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/csgiraffe

${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/csgiraffe: ${OBJECTFILES}
	${MKDIR} -p ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}
	${LINK.c} -o ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/csgiraffe ${OBJECTFILES} ${LDLIBSOPTIONS}

${OBJECTDIR}/2darray_nested.o: 2darray_nested.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/2darray_nested.o 2darray_nested.c

${OBJECTDIR}/arrays_test.o: arrays_test.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/arrays_test.o arrays_test.c

${OBJECTDIR}/better_calculator.o: better_calculator.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/better_calculator.o better_calculator.c

${OBJECTDIR}/calculator.o: calculator.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/calculator.o calculator.c

${OBJECTDIR}/comments.o: comments.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/comments.o comments.c

${OBJECTDIR}/constants.o: constants.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/constants.o constants.c

${OBJECTDIR}/for_loop.o: for_loop.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/for_loop.o for_loop.c

${OBJECTDIR}/functions.o: functions.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/functions.o functions.c

${OBJECTDIR}/functions_return.o: functions_return.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/functions_return.o functions_return.c

${OBJECTDIR}/guessing_game.o: guessing_game.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/guessing_game.o guessing_game.c

${OBJECTDIR}/hworld.o: hworld.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/hworld.o hworld.c

${OBJECTDIR}/if_statement.o: if_statement.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/if_statement.o if_statement.c

${OBJECTDIR}/input.o: input.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/input.o input.c

${OBJECTDIR}/mad_libs.o: mad_libs.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/mad_libs.o mad_libs.c

${OBJECTDIR}/memory_address.o: memory_address.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/memory_address.o memory_address.c

${OBJECTDIR}/number_fn.o: number_fn.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/number_fn.o number_fn.c

${OBJECTDIR}/pointer_deref.o: pointer_deref.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/pointer_deref.o pointer_deref.c

${OBJECTDIR}/pointers.o: pointers.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/pointers.o pointers.c

${OBJECTDIR}/primitivetype.o: primitivetype.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/primitivetype.o primitivetype.c

${OBJECTDIR}/printf_test.o: printf_test.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/printf_test.o printf_test.c

${OBJECTDIR}/read.o: read.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/read.o read.c

${OBJECTDIR}/shortstory.o: shortstory.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/shortstory.o shortstory.c

${OBJECTDIR}/structs.o: structs.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/structs.o structs.c

${OBJECTDIR}/switch_statement.o: switch_statement.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/switch_statement.o switch_statement.c

${OBJECTDIR}/while_loop.o: while_loop.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/while_loop.o while_loop.c

${OBJECTDIR}/write.o: write.c
	${MKDIR} -p ${OBJECTDIR}
	${RM} "$@.d"
	$(COMPILE.c) -g -std=c89 -MMD -MP -MF "$@.d" -o ${OBJECTDIR}/write.o write.c

# Subprojects
.build-subprojects:

# Clean Targets
.clean-conf: ${CLEAN_SUBPROJECTS}
	${RM} -r ${CND_BUILDDIR}/${CND_CONF}

# Subprojects
.clean-subprojects:

# Enable dependency checking
.dep.inc: .depcheck-impl

include .dep.inc
