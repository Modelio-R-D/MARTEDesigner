/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.MutualExclusionResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwMutualExclusionResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("975b8475-2f1e-4e9b-96e0-439ba6869e85")
public class SwMutualExclusionResourceParameter extends MutualExclusionResourceParameter {
    @objid ("85732def-9057-4c7d-bd51-6d33db9c5e86")
    public static final String STEREOTYPE_NAME = "SwMutualExclusionResource_Parameter";

    @objid ("d98f8665-3447-42d4-b820-ba83a027b59a")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE = "SwMutualExclusionResource_Parameter_accessTokenElements";

    @objid ("b87e46a7-33a8-4ddb-a361-7fd71e8d7057")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE = "SwMutualExclusionResource_Parameter_acquireServices";

    @objid ("604e0565-e9dd-4071-b85a-a6c908e5d3d0")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE = "SwMutualExclusionResource_Parameter_ceiling";

    @objid ("1f1274e3-f373-4ce2-aec7-ef891a0256cd")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Parameter_concurrentAccessProtocol";

    @objid ("1e4c9b9a-ebdb-4036-a5c0-89583c7f53ac")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE = "SwMutualExclusionResource_Parameter_mechanism";

    @objid ("b850f441-ba73-44b1-8879-1c48bd1e0edd")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE = "SwMutualExclusionResource_Parameter_otherProtectProtocol";

    @objid ("5efe121b-9fb4-4ac5-b991-ac60f92da10b")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE = "SwMutualExclusionResource_Parameter_protectKind";

    @objid ("072c079c-d12c-44ec-9155-cb9c4ef368e7")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE = "SwMutualExclusionResource_Parameter_releaseServices";

    @objid ("1fff1ce1-1a7b-418f-8aee-b4d92c8f36ec")
    public static final String SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE = "SwMutualExclusionResource_Parameter_scheduler";

    /**
     * Tells whether a {@link SwMutualExclusionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3752e089-77c5-4a90-a7b6-c936a5c53e13")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >> then instantiate a {@link SwMutualExclusionResourceParameter} proxy.
     * 
     * @return a {@link SwMutualExclusionResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("2e40dd41-25de-4daf-979c-9725b68b18fc")
    public static SwMutualExclusionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwMutualExclusionResourceParameter.STEREOTYPE_NAME);
        return SwMutualExclusionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwMutualExclusionResourceParameter} proxy or <i>null</i>.
     */
    @objid ("ebf010b5-328e-4040-92ab-aa683d2916df")
    public static SwMutualExclusionResourceParameter instantiate(final Parameter obj) {
        return SwMutualExclusionResourceParameter.canInstantiate(obj) ? new SwMutualExclusionResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwMutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << SwMutualExclusionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwMutualExclusionResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9ac5175a-595f-4f20-b1e8-71905fc4ba2e")
    public static SwMutualExclusionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwMutualExclusionResourceParameter.canInstantiate(obj))
        	return new SwMutualExclusionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwMutualExclusionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bc61f84c-0a1c-4bf0-b205-88ed50de241b")
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
        SwMutualExclusionResourceParameter other = (SwMutualExclusionResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("57d98851-bed1-4efa-9280-ae010c8ff728")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Parameter_accessTokenElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("505175bf-cf39-418c-9456-ca365294ba7b")
    public List<String> getSwMutualExclusionResource_Parameter_accessTokenElements() {
        return this.elt.getTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Parameter_acquireServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e71292bb-4c88-48d4-9bf8-d5120a1d6285")
    public List<String> getSwMutualExclusionResource_Parameter_acquireServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7433772b-afd1-42b8-b384-11ee49b2a4a2")
    public String getSwMutualExclusionResource_Parameter_ceiling() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b10c6dc9-0a53-48e0-9853-fc9d0955d290")
    public String getSwMutualExclusionResource_Parameter_concurrentAccessProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("775ad8b2-372d-4fb0-8c99-d5754f84a7ff")
    public String getSwMutualExclusionResource_Parameter_mechanism() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4bd988c1-bd79-4b43-b679-ab455a44778e")
    public String getSwMutualExclusionResource_Parameter_otherProtectProtocol() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b8a0d90-018e-44b1-98e9-8094c09b79a0")
    public String getSwMutualExclusionResource_Parameter_protectKind() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwMutualExclusionResource_Parameter_releaseServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d219ba9d-b368-4bca-86a7-e8af8613d6bf")
    public List<String> getSwMutualExclusionResource_Parameter_releaseServices() {
        return this.elt.getTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwMutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91f9a7ca-6ab3-45af-abbe-2dbf0ace5c6e")
    public String getSwMutualExclusionResource_Parameter_scheduler() {
        return this.elt.getTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("73cc7429-a081-4921-b824-965cd260567e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Parameter_accessTokenElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43edc5cd-cb77-4194-9c8f-c1f61437c584")
    public void setSwMutualExclusionResource_Parameter_accessTokenElements(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Parameter_acquireServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd7f82c9-4685-48e9-bbfd-c97327c5651f")
    public void setSwMutualExclusionResource_Parameter_acquireServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbd95431-89c4-4987-b2d0-50a28fefc752")
    public void setSwMutualExclusionResource_Parameter_ceiling(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_concurrentAccessProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77e38cdb-ab4e-4eac-b522-3b46aa656589")
    public void setSwMutualExclusionResource_Parameter_concurrentAccessProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_mechanism'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dab154ce-5809-46b3-8864-6dbb54823246")
    public void setSwMutualExclusionResource_Parameter_mechanism(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f83d734-1d0d-4a8d-85f9-b9f9cdb56f78")
    public void setSwMutualExclusionResource_Parameter_otherProtectProtocol(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aef56f81-9989-4553-ab28-6eab3292766b")
    public void setSwMutualExclusionResource_Parameter_protectKind(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwMutualExclusionResource_Parameter_releaseServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("831396c4-1f33-4b70-b0f9-edd090d6a34f")
    public void setSwMutualExclusionResource_Parameter_releaseServices(final List<String> values) {
        this.elt.putTagValues(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwMutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0bc49738-6c9d-4fa0-a661-5a195fe52fe5")
    public void setSwMutualExclusionResource_Parameter_scheduler(final String value) {
        this.elt.putTagValue(SwMutualExclusionResourceParameter.MdaTypes.SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("aadfdf83-2f36-42dc-a994-8d3effaf2f1e")
    protected SwMutualExclusionResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("3894b4a9-a97c-402a-9dd7-c3dcd9ab6a4f")
    public static final class MdaTypes {
        @objid ("187ddf9e-d76f-4f3e-a5b9-0c232bce0c2f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("50bf5a4e-edb7-4311-aff0-b5ed0fc25c4c")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT;

        @objid ("ad95b6c5-6c65-4970-8bf7-a029a900dd6a")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT;

        @objid ("1dfcedba-84c9-4307-8782-5e114d5c0018")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT;

        @objid ("bf596adf-2408-4a22-967b-5a24eadc2c9b")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT;

        @objid ("a1198662-73af-4911-ab52-f2835e190738")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT;

        @objid ("93bccdf1-ffaf-45a9-b7cc-92d51c44cccc")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT;

        @objid ("7c7f2e69-5af8-4448-a484-7e41e0c0a5e0")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT;

        @objid ("caa4a722-0bb7-4838-aa12-60b3bdd6c31c")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("89e6af8d-2812-4ccb-8679-627ccc31db97")
        public static TagType SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT;

        @objid ("28574d80-c99a-4333-bfad-058abe86984b")
        private static Stereotype MDAASSOCDEP;

        @objid ("64000207-a307-4868-935c-9e20971a690b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d369658f-1c73-4a0a-9b65-907473542c18")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "023bbadf-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_MECHANISM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454424-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CONCURRENTACCESSPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0245442b-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACCESSTOKENELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454432-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_RELEASESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454439-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_ACQUIRESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02454440-0ccf-11df-8525-001302895b2b");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899a-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899b-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899c-92ad-11e0-a69d-0027103f347c");
            SWMUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5ee899d-92ad-11e0-a69d-0027103f347c");
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
