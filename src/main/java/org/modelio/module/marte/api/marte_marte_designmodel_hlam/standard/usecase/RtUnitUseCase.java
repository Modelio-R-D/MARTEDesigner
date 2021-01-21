/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.usecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("4f46d805-1b8a-4a3f-8633-def5cd1295f9")
public class RtUnitUseCase {
    @objid ("a4c61b12-02a0-4b48-99d4-967fc8a18b24")
    public static final String STEREOTYPE_NAME = "RtUnit_UseCase";

    @objid ("cbbbc9e3-3c2b-4475-8314-78e9dbc58779")
    public static final String RTUNIT_USECASE_ISDYNAMIC_TAGTYPE = "RtUnit_UseCase_isDynamic";

    @objid ("496fd2ec-fc9f-48d6-bcac-723b1a1c6cae")
    public static final String RTUNIT_USECASE_ISMAIN_TAGTYPE = "RtUnit_UseCase_isMain";

    @objid ("49842098-0bc1-44ff-bc0e-029949633fc6")
    public static final String RTUNIT_USECASE_MAIN_TAGTYPE = "RtUnit_UseCase_main";

    @objid ("edffcb86-67b1-4cf4-b589-8c31232f8987")
    public static final String RTUNIT_USECASE_MEMORYSIZE_TAGTYPE = "RtUnit_UseCase_memorySize";

    @objid ("69d4e73d-f4d6-4338-a1a0-72dbeac7614d")
    public static final String RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE = "RtUnit_UseCase_msgMaxSize";

    @objid ("acc7b4fa-1302-437c-a164-11d8536fdee0")
    public static final String RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE = "RtUnit_UseCase_operationalMode";

    @objid ("e4ecd1a3-5ae1-4df5-8c9c-1725bf0d1d3c")
    public static final String RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_UseCase_queueSchedPolicy";

    @objid ("734f0740-37f2-4142-bb30-a00553271b1f")
    public static final String RTUNIT_USECASE_QUEUESIZE_TAGTYPE = "RtUnit_UseCase_queueSize";

    @objid ("d2552a0d-f3e6-4704-8120-38d9c6012d93")
    public static final String RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE = "RtUnit_UseCase_srPoolPolicy";

    @objid ("0179903c-e705-4ca5-a104-b182d20248cd")
    public static final String RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE = "RtUnit_UseCase_srPoolSize";

    @objid ("1c9e7270-86bb-4684-b0a1-ab41ae189d2c")
    public static final String RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_UseCase_srPoolWaitingTime";

    /**
     * The underlying {@link UseCase} represented by this proxy, never null.
     */
    @objid ("25acb3a2-4bbf-4142-b970-450a3b7e6d49")
    protected final UseCase elt;

    /**
     * Tells whether a {@link RtUnitUseCase proxy} can be instantiated from a {@link MObject} checking it is a {@link UseCase} stereotyped << RtUnit_UseCase >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("16ca8ce0-2b8a-4f6c-bf07-022face04c50")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof UseCase) && ((UseCase) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitUseCase.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link UseCase} stereotyped << RtUnit_UseCase >> then instantiate a {@link RtUnitUseCase} proxy.
     * 
     * @return a {@link RtUnitUseCase} proxy on the created {@link UseCase}.
     */
    @objid ("13d39921-6309-41ae-b70f-d170aafc0723")
    public static RtUnitUseCase create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("UseCase");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitUseCase.STEREOTYPE_NAME);
        return RtUnitUseCase.instantiate((UseCase)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitUseCase} proxy from a {@link UseCase} stereotyped << RtUnit_UseCase >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a UseCase
     * @return a {@link RtUnitUseCase} proxy or <i>null</i>.
     */
    @objid ("27522a60-9dce-45fe-82a6-4380c244b4fa")
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
    @objid ("0cee743c-aa3e-4ad3-b003-f62ad25f1dff")
    public static RtUnitUseCase safeInstantiate(final UseCase obj) throws IllegalArgumentException {
        if (RtUnitUseCase.canInstantiate(obj))
        	return new RtUnitUseCase(obj);
        else
        	throw new IllegalArgumentException("RtUnitUseCase: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09ff1c5d-23e1-49c2-ab72-e499ec63c703")
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
    @objid ("0e7e3647-2d0e-4594-a1d3-790cb6cb185b")
    public UseCase getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_UseCase_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d80590d-f461-4d70-9404-efe18558a3bb")
    public String getRtUnit_UseCase_main() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe210025-4b6b-4c91-980b-d5d99b6c5381")
    public String getRtUnit_UseCase_memorySize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("728eb054-4b43-4074-a69f-28f7451e68dc")
    public String getRtUnit_UseCase_msgMaxSize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("107c17dd-2eef-4996-8573-4c8f740d13af")
    public String getRtUnit_UseCase_operationalMode() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70350786-ac75-4f65-8895-91bbfd94a12d")
    public String getRtUnit_UseCase_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c11643a-6f6f-4d8c-9f27-35435135444b")
    public String getRtUnit_UseCase_queueSize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3bd02404-b640-4d8d-b240-a8af552347d0")
    public String getRtUnit_UseCase_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7748c894-10ef-45fb-ba24-b764fd8eefed")
    public String getRtUnit_UseCase_srPoolSize() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_UseCase_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49178c93-318f-49b8-9f9c-f26c2d3beda7")
    public String getRtUnit_UseCase_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @objid ("242cfd1f-219e-4578-b505-55979d0bb74f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_UseCase_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd87353e-5c07-4f63-84eb-8873f002449b")
    public boolean isRtUnit_UseCase_isDynamic() {
        return this.elt.isTagged(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_UseCase_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba667d7f-6878-4a55-a81e-b3a58d874330")
    public boolean isRtUnit_UseCase_isMain() {
        return this.elt.isTagged(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_UseCase_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a278d4c6-72fa-4695-8acf-849dbfe558a5")
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
    @objid ("a4a4e8f7-ea27-4c9c-91c6-0860042cd2b4")
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
    @objid ("c1d2bced-a1da-4eff-b6f5-515caa47cf30")
    public void setRtUnit_UseCase_main(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45070405-3106-4b7d-a3bf-828fc9adb650")
    public void setRtUnit_UseCase_memorySize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c1a2ee3-88b7-41b0-92a7-45cb30227b40")
    public void setRtUnit_UseCase_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1cac3f63-6655-4fd4-9a44-b11c014997fb")
    public void setRtUnit_UseCase_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("04bb4d71-c0c4-45ab-a189-8437471020ee")
    public void setRtUnit_UseCase_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d21b95f9-58ea-4ddb-87fb-1a315dd9438c")
    public void setRtUnit_UseCase_queueSize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc57a363-c567-440d-a369-347fe0f37171")
    public void setRtUnit_UseCase_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99b3be22-c58c-45a0-805f-0ede07aac42f")
    public void setRtUnit_UseCase_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_UseCase_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb384c86-3ff7-406a-855a-c1ec8d4ca14a")
    public void setRtUnit_UseCase_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitUseCase.MdaTypes.RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("f2e710d1-5f33-49fe-abdd-fcd0d4263f53")
    protected RtUnitUseCase(final UseCase elt) {
        this.elt = elt;
    }

    @objid ("6d016c38-4377-45a0-8488-0ff66878742d")
    public static final class MdaTypes {
        @objid ("cf97d512-4d20-4e3e-89df-6aa76a49a76b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad569349-e6c2-41c8-92e4-ed319d32709f")
        public static TagType RTUNIT_USECASE_ISDYNAMIC_TAGTYPE_ELT;

        @objid ("a93d7367-e8df-4875-9d2c-5e5f2dbcb44d")
        public static TagType RTUNIT_USECASE_ISMAIN_TAGTYPE_ELT;

        @objid ("d956af8b-e4bb-4cd8-a215-f593a22c505f")
        public static TagType RTUNIT_USECASE_SRPOOLSIZE_TAGTYPE_ELT;

        @objid ("dd7184be-fe79-41b4-8ffe-75ea8cfd6467")
        public static TagType RTUNIT_USECASE_SRPOOLPOLICY_TAGTYPE_ELT;

        @objid ("43b5b9c7-c0cd-41be-85d5-7b4af9661c4c")
        public static TagType RTUNIT_USECASE_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        @objid ("eef9a505-d126-4124-9f30-ea5a818790db")
        public static TagType RTUNIT_USECASE_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        @objid ("10b78f58-3c8e-48be-a2bb-29f13af6eacd")
        public static TagType RTUNIT_USECASE_QUEUESIZE_TAGTYPE_ELT;

        @objid ("d280ff4b-220a-4408-ad03-9e3f93d7d93d")
        public static TagType RTUNIT_USECASE_MSGMAXSIZE_TAGTYPE_ELT;

        @objid ("3c37517f-e1da-47d8-bbfc-5d7d3b610cf6")
        public static TagType RTUNIT_USECASE_OPERATIONALMODE_TAGTYPE_ELT;

        @objid ("345c3351-35dd-4fc6-8a60-af8909f97d7a")
        public static TagType RTUNIT_USECASE_MAIN_TAGTYPE_ELT;

        @objid ("aeccbab1-ec95-450d-9b71-c71d07f5f91a")
        public static TagType RTUNIT_USECASE_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("46a0a098-be60-4b8c-8216-8334ad408cdb")
        private static Stereotype MDAASSOCDEP;

        @objid ("bf727a71-5d1b-4d93-a1ca-63b91e6cb32f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("07f6a1f4-9d95-4226-9909-e7d12ac45425")
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
