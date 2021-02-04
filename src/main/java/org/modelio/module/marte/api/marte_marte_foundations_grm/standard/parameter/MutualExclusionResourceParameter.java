/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << MutualExclusionResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1f3d8337-5d10-4142-a3f3-bb3dab655d8e")
public class MutualExclusionResourceParameter extends ResourceParameter {
    @objid ("271ef5e4-1dae-4e0d-b782-7aa3d822471e")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Parameter";

    @objid ("8d5907f8-1ce8-41f8-9849-0789891d58d0")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE = "MutualExclusionResource_Parameter_ceiling";

    @objid ("9243d528-2376-4071-ba75-7ce0e408efcb")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Parameter_otherProtectProtocol";

    @objid ("d57ed6eb-f060-4e1d-8b32-eea84b052299")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Parameter_protectKind";

    @objid ("666f55ec-23ee-4d45-a951-aa734fc21594")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE = "MutualExclusionResource_Parameter_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("92ea35c0-3711-4c8b-8510-0b9c05094965")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MutualExclusionResource_Parameter >> then instantiate a {@link MutualExclusionResourceParameter} proxy.
     * 
     * @return a {@link MutualExclusionResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("bff44730-3288-42aa-bda1-2aaa1e5787a4")
    public static MutualExclusionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceParameter.STEREOTYPE_NAME);
        return MutualExclusionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MutualExclusionResourceParameter} proxy or <i>null</i>.
     */
    @objid ("522790db-9ec7-4735-ae58-8f9d0cfdd40e")
    public static MutualExclusionResourceParameter instantiate(final Parameter obj) {
        return MutualExclusionResourceParameter.canInstantiate(obj) ? new MutualExclusionResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link MutualExclusionResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1b3438b8-bfbb-4431-8499-13682fee4901")
    public static MutualExclusionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MutualExclusionResourceParameter.canInstantiate(obj))
        	return new MutualExclusionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77e8da61-f472-4732-ab1c-541b4966571c")
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
        MutualExclusionResourceParameter other = (MutualExclusionResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("ff78f86e-a452-4c98-aa16-493155272a43")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0249e17b-24f0-4522-a4c6-5b208a01d550")
    public String getMutualExclusionResource_Parameter_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cc7e3cb-51e9-4ebc-88f3-6892c2f43102")
    public String getMutualExclusionResource_Parameter_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c0f4eee-b81e-43da-9343-4bc308762f5b")
    public String getMutualExclusionResource_Parameter_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ef63797-bb1d-4a07-9912-16dde26993a9")
    public String getMutualExclusionResource_Parameter_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("6506d5b0-d577-4c08-a795-66ac2b8d1c00")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85e3591f-73bd-45e5-a187-a658fa9ca629")
    public void setMutualExclusionResource_Parameter_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1edef60-868b-4448-ba7a-e02306abda35")
    public void setMutualExclusionResource_Parameter_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80d6abb2-e48f-4ca5-b263-057e35fed776")
    public void setMutualExclusionResource_Parameter_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("354caf5b-661b-4363-9c5e-6145b8642e6e")
    public void setMutualExclusionResource_Parameter_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("f0e8a8e3-d0b6-4e81-9df9-35a222edb251")
    protected MutualExclusionResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("30f51df0-8bd2-4420-97f8-0bf2dbd16724")
    public static final class MdaTypes {
        @objid ("58ebb45d-df85-48f0-9ab5-7eeef0c9472b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2057de6c-9617-4d9d-ace6-212950aa1a2d")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT;

        @objid ("c386bc05-b2da-4e1b-983f-6c303005e9a9")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT;

        @objid ("404c7cf0-4659-4ccb-9611-b3c5bf8dc811")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("6af7ac37-218a-4932-89dc-1a8e5fa3fb14")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT;

        @objid ("7db99e1d-2d4b-4e8f-87a1-1eefd30d4f0b")
        private static Stereotype MDAASSOCDEP;

        @objid ("51c59371-42ef-4936-8c29-814a66a67e17")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a855e444-7937-499a-b31c-3ddf72cbf523")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002a77c3-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77ca-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda12-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda19-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda20-0ccf-11df-8525-001302895b2b");
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
