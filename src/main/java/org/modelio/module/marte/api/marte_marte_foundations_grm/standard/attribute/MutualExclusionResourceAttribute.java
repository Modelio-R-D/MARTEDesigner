/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("a88c5ae0-9291-4a0d-9168-9a48f03f3a86")
    public static final String STEREOTYPE_NAME = "MutualExclusionResource_Attribute";

    @objid ("1d38ad1a-15ac-4354-a996-7c4c23ca1a7f")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE = "MutualExclusionResource_Attribute_ceiling";

    @objid ("274602dd-702a-4562-b63e-ba53de09ccd9")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE = "MutualExclusionResource_Attribute_otherProtectProtocol";

    @objid ("3b8534b3-7c47-4c83-a718-0bcb13ff87fd")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE = "MutualExclusionResource_Attribute_protectKind";

    @objid ("ecb7f432-0be2-4c52-9756-6d9a1822d86e")
    public static final String MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE = "MutualExclusionResource_Attribute_scheduler";

    /**
     * Tells whether a {@link MutualExclusionResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MutualExclusionResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("caa0b29b-11a3-4db9-9797-2872acb71a46")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MutualExclusionResource_Attribute >> then instantiate a {@link MutualExclusionResourceAttribute} proxy.
     * 
     * @return a {@link MutualExclusionResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("73745817-462d-4ce6-9d98-e3759ca7cbc7")
    public static MutualExclusionResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MutualExclusionResourceAttribute.STEREOTYPE_NAME);
        return MutualExclusionResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MutualExclusionResourceAttribute} proxy from a {@link Attribute} stereotyped << MutualExclusionResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MutualExclusionResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("ac501c5c-9f1e-4eca-87fe-a78a8e275f12")
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
    @objid ("56a2277c-7cee-4088-bd82-8cdd7ec3c134")
    public static MutualExclusionResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MutualExclusionResourceAttribute.canInstantiate(obj))
        	return new MutualExclusionResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("MutualExclusionResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("16bae215-5fa0-4d04-9a90-b290272c6eac")
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
    @objid ("b633d20a-620e-41af-a386-bb885b9c5806")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ffe83b51-7fff-422e-9c31-0e7948079b14")
    public String getMutualExclusionResource_Attribute_ceiling() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c3e34a1-b559-4e76-bca9-2e458b3a6253")
    public String getMutualExclusionResource_Attribute_otherProtectProtocol() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64b02a07-dd74-4ada-b35e-98b8f7ee072b")
    public String getMutualExclusionResource_Attribute_protectKind() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'MutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bbcebcf-1b01-4322-8451-79f80e98aec9")
    public String getMutualExclusionResource_Attribute_scheduler() {
        return this.elt.getTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT);
    }

    @objid ("5f94bdbb-c11a-416f-9aa8-a60def01e64b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_ceiling'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5e2e6b1a-0070-4451-8a14-2cad7c18f743")
    public void setMutualExclusionResource_Attribute_ceiling(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_otherProtectProtocol'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d96a37a9-ca77-4891-9c84-c2051528ff8f")
    public void setMutualExclusionResource_Attribute_otherProtectProtocol(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_protectKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f4c10b3e-7d4d-4a13-8a85-8fef5bbf4967")
    public void setMutualExclusionResource_Attribute_protectKind(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'MutualExclusionResource_Attribute_scheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ae6b714-3a43-4780-8349-4866aa566d8e")
    public void setMutualExclusionResource_Attribute_scheduler(final String value) {
        this.elt.putTagValue(MutualExclusionResourceAttribute.MdaTypes.MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT, value);
    }

    @objid ("38bc9d21-8573-4752-af9b-f1580873460d")
    protected MutualExclusionResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("e3be570e-aeec-4b99-a9a3-ec6530efc13f")
    public static final class MdaTypes {
        @objid ("cf8d4717-bfbb-426b-ad15-859984c20118")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a609bd21-dd12-4d46-be61-b1348388d069")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_PROTECTKIND_TAGTYPE_ELT;

        @objid ("551a4f36-9a44-4e5f-9e14-9aa4d608e6a9")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_CEILING_TAGTYPE_ELT;

        @objid ("fc68ad82-de0a-47eb-b2be-89c997efabd4")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_OTHERPROTECTPROTOCOL_TAGTYPE_ELT;

        @objid ("c9f48eee-373f-4eb9-a7d1-069e7f001425")
        public static TagType MUTUALEXCLUSIONRESOURCE_ATTRIBUTE_SCHEDULER_TAGTYPE_ELT;

        @objid ("16b898b9-f70e-41c1-a7c9-ec3e01236ea9")
        private static Stereotype MDAASSOCDEP;

        @objid ("028c5738-f8dd-4a86-b163-8c32244da54f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("66ff94a9-f4f2-4fc5-a785-cdb94a1fbc2c")
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
