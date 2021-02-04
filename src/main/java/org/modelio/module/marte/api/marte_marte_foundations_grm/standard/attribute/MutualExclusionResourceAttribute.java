/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << MutualExclusionResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9f7ac2e1-8849-4314-913e-ccf2c19051fe")
public class MutualExclusionResourceAttribute extends ResourceAttribute {
    @objid ("669a1136-1fb2-4e0d-a0d5-52876eabf79f")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Attribute";

    @objid ("51cfba18-79ae-42bb-9edf-0a6dfb170d30")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE = "MutualExclusionResource_Attribute_ceiling";

    @objid ("d5afb9c2-a01c-44f0-9f4e-4567cd50000a")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Attribute_otherProtectProtocol";

    @objid ("931efa59-eba0-4d4f-9e4a-dac418fbf34a")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Attribute_protectKind";

    @objid ("0a22dc56-670d-4e46-ad4d-78f20c228a42")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE = "MutualExclusionResource_Attribute_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MutualExclusionResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("54b4b9b9-9d52-4c3c-92cd-06955f6147ee")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MutualExclusionResource_Attribute >> then instantiate a {@link MutualExclusionResourceAttribute} proxy.
     * 
     * @return a {@link MutualExclusionResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("0c58ed3e-a731-4891-afea-f7aed6771b8f")
    public static MutualExclusionResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAttribute.STEREOTYPE_NAME);
        return MutualExclusionResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAttribute} proxy from a {@link Attribute} stereotyped << MutualExclusionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MutualExclusionResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("45184ff6-f0f6-4021-b2fa-75dff272d4e1")
    public static MutualExclusionResourceAttribute instantiate(final Attribute obj) {
        return MutualExclusionResourceAttribute.canInstantiate(obj) ? new MutualExclusionResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAttribute} proxy from a {@link Attribute} stereotyped << MutualExclusionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link MutualExclusionResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f065cfdd-f67d-4dd1-86c9-f3d1adefc432")
    public static MutualExclusionResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MutualExclusionResourceAttribute.canInstantiate(obj))
        	return new MutualExclusionResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1af9e72f-9a1b-482c-8e73-2cfb495ba13c")
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
        MutualExclusionResourceAttribute other = (MutualExclusionResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("aa7b04d6-2aea-4805-8169-b8af63848ac1")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79e8c85d-00f5-472c-b98e-936290080501")
    public String getMutualExclusionResource_Attribute_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9d2facfd-3d79-4f74-b356-7816fd29f7d4")
    public String getMutualExclusionResource_Attribute_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9fc3435-feb8-452c-962f-6a27447ff885")
    public String getMutualExclusionResource_Attribute_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48c7cfec-864c-452f-89a7-55196c3fc957")
    public String getMutualExclusionResource_Attribute_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("74c9d545-25ee-47e7-bfab-07ab0f682a21")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3733e57c-7bf2-479f-bc25-14327aa51e87")
    public void setMutualExclusionResource_Attribute_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c405fee-bbff-43f6-a0f3-11820e68c31a")
    public void setMutualExclusionResource_Attribute_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e8870ed-7f46-4882-9e75-bf84cca4b681")
    public void setMutualExclusionResource_Attribute_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7da84e10-5e07-495d-aa8d-d91309e48779")
    public void setMutualExclusionResource_Attribute_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("afcb95fe-b18f-4fc4-b8ff-28cce4aa26eb")
    protected MutualExclusionResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("e3be570e-aeec-4b99-a9a3-ec6530efc13f")
    public static final class MdaTypes {
        @objid ("fa24ae0a-e697-4a8e-9da1-6c69637406de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20cb313a-5dc8-4752-a701-2e6444ad8ae1")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("59c4958b-e9ee-4697-836f-ff8569ffa534")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT;

        @objid ("f6a64dc6-18cf-488d-a165-8b2dcede5ba1")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("92123ab4-ddad-46c7-94c2-24ae9a8ea5b7")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT;

        @objid ("5f5b041e-adf4-470c-86f3-96dff335de58")
        private static Stereotype MDAASSOCDEP;

        @objid ("84e5273a-44bf-4a37-9b8d-b39e125a6a5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d3ac7ec-42a9-4825-adb8-a1b350cc0305")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "002a77c6-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002a77cd-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda15-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda1c-0ccf-11df-8525-001302895b2b");
            MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "002cda23-0ccf-11df-8525-001302895b2b");
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
