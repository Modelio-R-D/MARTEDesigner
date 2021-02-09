/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link UseCase} with << RtUnit_UseCase >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtUnitUseCase {
    public static final String STEREOTYPE_NAME = "RtUnit_UseCase";

    public static final String RTUNIT_USECASE_ISDYNAMIC_TAGTYPE = "RtUnit_UseCase_isDynamic";

    public static final String RTUNIT_USECASE_ISMAIN_TAGTYPE = "RtUnit_UseCase_isMain";

    public static final String RTUNIT_USECASE_MAIN_TAGTYPE = "RtUnit_UseCase_main";

    public static final String RTUNIT_USECASE_MEMORYSIZE_TAGTYPE = "RtUnit_UseCase_memorySize";

    public static final String RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE = "RtUnit_UseCase_msgMaxSize";

    public static final String RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE = "RtUnit_UseCase_operationalMode";

    public static final String RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_UseCase_queueSchedPolicy";

    public static final String RTUNIT_USECASE_QUEUESIZE_TAGTYPE = "RtUnit_UseCase_queueSize";

    public static final String RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE = "RtUnit_UseCase_srPoolPolicy";

    public static final String RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE = "RtUnit_UseCase_srPoolSize";

    public static final String RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_UseCase_srPoolWaitingTime";

    /**
     * The underlying {@link UseCase} represented by this proxy, never null.
     */
    protected final UseCase elt;

    /**
     * Tells whether a {@link RtUnitUseCase proxy} can be instantiated from a {@link MObject} checking it is a {@link UseCase} stereotyped << RtUnit_UseCase >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof UseCase) && ((UseCase) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitUseCase.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link UseCase} stereotyped << RtUnit_UseCase >> then instantiate a {@link RtUnitUseCase} proxy.
     * 
     * @return a {@link RtUnitUseCase} proxy on the created {@link UseCase}.
     */
    public static RtUnitUseCase create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.UseCase");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitUseCase.STEREOTYPE_NAME);
        return RtUnitUseCase.instantiate((UseCase)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitUseCase} proxy from a {@link UseCase} stereotyped << RtUnit_UseCase >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a UseCase
     * @return a {@link RtUnitUseCase} proxy or <i>null</i>.
     */
    public static RtUnitUseCase instantiate(final UseCase obj) {
        return RtUnitUseCase.canInstantiate(obj) ? new RtUnitUseCase(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtUnitUseCase} proxy from a {@link UseCase} stereotyped << RtUnit_UseCase >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link UseCase}
     * @return a {@link RtUnitUseCase} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtUnitUseCase safeInstantiate(final UseCase obj) throws IllegalArgumentException {
        if (RtUnitUseCase.canInstantiate(obj))
        	return new RtUnitUseCase(obj);
        else
        	throw new IllegalArgumentException("RtUnitUseCase: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RtUnitUseCase other = (RtUnitUseCase) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link UseCase}. 
     * @return the UseCase represented by this proxy, never null.
     */
    public UseCase getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_UseCase_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_main() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_memorySize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_msgMaxSize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_operationalMode() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_queueSize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_srPoolSize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtUnit_UseCase_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_UseCase_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_UseCase_isDynamic() {
        return this.elt.isTagged(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_UseCase_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtUnit_UseCase_isMain() {
        return this.elt.isTagged(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_UseCase_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_isDynamic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISDYNAMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_UseCase_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_isMain(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISMAIN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_main(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_memorySize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_queueSize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtUnit_UseCase_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    protected RtUnitUseCase(final UseCase elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTUNIT_USECASE_ISDYNAMIC_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_ISMAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_QUEUESIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_MAIN_TAGTYPE_ELT;

        public static TagType RTUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "527dc29f-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_ISDYNAMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a0-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_ISMAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a1-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a2-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a3-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a4-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9e5b916a-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_USECASE_QUEUESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9e5b6a59-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9e5b6a5a-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a5-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_MAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a6-0ce9-11df-b742-001302895b2b");
            RTUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "527dc2a7-0ce9-11df-b742-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
