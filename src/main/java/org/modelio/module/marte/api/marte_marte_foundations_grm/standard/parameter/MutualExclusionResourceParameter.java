/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("498879f7-391f-4207-b5ed-6dd2019bb198")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Parameter";

    @objid ("8c2c2f5e-ec8d-4f92-818d-e5a018820d62")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE = "MutualExclusionResource_Parameter_ceiling";

    @objid ("898b7909-465e-4a3d-a9ee-1bf9849e8a3a")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Parameter_otherProtectProtocol";

    @objid ("ffe237cc-630b-4a36-a30d-ee73c9f98763")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Parameter_protectKind";

    @objid ("ac987c94-1fd3-4662-92bb-6185c8d3474f")
    public static final String MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE = "MutualExclusionResource_Parameter_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d4f434d1-e112-40d5-97ab-c956fb1988e6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << MutualExclusionResource_Parameter >> then instantiate a {@link MutualExclusionResourceParameter} proxy.
     * 
     * @return a {@link MutualExclusionResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("eaa178a9-a95e-45cd-80ac-df4d3d38f90b")
    public static MutualExclusionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceParameter.STEREOTYPE_NAME);
        return MutualExclusionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceParameter} proxy from a {@link Parameter} stereotyped << MutualExclusionResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link MutualExclusionResourceParameter} proxy or <i>null</i>.
     */
    @objid ("768e4358-2ff0-4319-af92-1f443fa7aa03")
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
    @objid ("9860af7c-4e5a-4eba-8d2d-ce825bb99c35")
    public static MutualExclusionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (MutualExclusionResourceParameter.canInstantiate(obj))
        	return new MutualExclusionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6aabb8d9-ee2f-4169-8011-017b92792398")
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
    @objid ("07340b57-ad36-4060-8cc5-395dbce4e4ad")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51d67371-4224-4c64-a1b7-cafdcd708b09")
    public String getMutualExclusionResource_Parameter_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01f527c8-f3ab-468a-bfc1-4a7a57ba81d5")
    public String getMutualExclusionResource_Parameter_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38cc2ffb-6e5a-41e9-a953-8b463cc71a67")
    public String getMutualExclusionResource_Parameter_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c12515d8-70aa-41a8-bda5-358f2a1f8630")
    public String getMutualExclusionResource_Parameter_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("27823759-ef39-4d6c-a3c0-a4544d920a3d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c50ec299-1301-4e5b-bf5c-65252bbff813")
    public void setMutualExclusionResource_Parameter_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db5b5e2f-8311-4e46-b5ab-4ed8b5ea2589")
    public void setMutualExclusionResource_Parameter_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50bf4bed-2419-47f7-b2a1-20e64b264ab5")
    public void setMutualExclusionResource_Parameter_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Parameter_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5dda462c-ff67-4f44-931a-bb42bb3ba9c7")
    public void setMutualExclusionResource_Parameter_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceParameter.MdaTypes.MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("fd7cdde3-369b-4166-af5b-58344ececc86")
    protected MutualExclusionResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("30f51df0-8bd2-4420-97f8-0bf2dbd16724")
    public static final class MdaTypes {
        @objid ("5dbbb6f2-f87b-4887-9359-ec1cf1692101")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cc00477d-29e7-4577-ade7-62e499cf4e4f")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_PROTECTKIND_TAGTYPE_ELT;

        @objid ("90f59fff-9b67-4558-876a-4fa02219af74")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_CEILING_TAGTYPE_ELT;

        @objid ("72c4588f-f575-48b8-be4f-241a7558fa22")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("ba2f74d2-a445-4ddf-b0a1-7dd9f31d0e31")
        public static TagType MUTUALEXCLUSIONRESOURCE_PARAMETER_SCHEDULER_TAGTYPE_ELT;

        @objid ("52a5420a-4b31-43cf-afcd-177329a5fcd6")
        private static Stereotype MDAASSOCDEP;

        @objid ("a3ec8bb0-1a0a-4f7a-bf64-f9d6ae4fcada")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("748e1686-c980-4c2f-a45a-f958084f1dad")
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
