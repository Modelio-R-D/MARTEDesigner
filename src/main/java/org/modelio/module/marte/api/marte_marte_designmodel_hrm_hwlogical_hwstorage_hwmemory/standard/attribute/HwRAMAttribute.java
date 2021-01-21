/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << HwRAM_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0ad1c5f7-4697-4cce-a5a8-d00797c47c7a")
public class HwRAMAttribute extends HwMemoryAttribute {
    @objid ("945ca09f-da96-4f5d-8def-f144c2050801")
    public static final String STEREOTYPE_NAME = "HwRAM_Attribute";

    @objid ("0a2d752c-691c-4aae-9fb5-58e6b6340f36")
    public static final String HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE = "HwRAM_Attribute_isNonVolatile";

    @objid ("a1fa17b5-dbb2-403d-aafd-55601b41e2f9")
    public static final String HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE = "HwRAM_Attribute_isStatic";

    @objid ("4cfd2359-b365-470f-a3a0-546d5ac537f3")
    public static final String HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE = "HwRAM_Attribute_isSynchronous";

    @objid ("28db2dc1-0cd6-4105-ac3b-992e7bad50e2")
    public static final String HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE = "HwRAM_Attribute_organization";

    @objid ("3f40ac20-7243-46b6-9bde-b291d96c018d")
    public static final String HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE = "HwRAM_Attribute_repl_Policy";

    @objid ("2fa87e51-9005-4563-8839-95c140444dbb")
    public static final String HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE = "HwRAM_Attribute_writePolicy";

    /**
     * Tells whether a {@link HwRAMAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwRAM_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1e2e3c8b-dfdb-4b78-bd03-7728cf3d385d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwRAM_Attribute >> then instantiate a {@link HwRAMAttribute} proxy.
     * 
     * @return a {@link HwRAMAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("f973c193-a1f9-4a16-8f85-0aea81280e9f")
    public static HwRAMAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwRAMAttribute.STEREOTYPE_NAME);
        return HwRAMAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwRAMAttribute} proxy from a {@link Attribute} stereotyped << HwRAM_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwRAMAttribute} proxy or <i>null</i>.
     */
    @objid ("ae74a4c6-2da8-4442-9e45-2d9cab9dffd1")
    public static HwRAMAttribute instantiate(final Attribute obj) {
        return HwRAMAttribute.canInstantiate(obj) ? new HwRAMAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwRAMAttribute} proxy from a {@link Attribute} stereotyped << HwRAM_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwRAMAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("20a309bc-9338-4d69-91d7-a93a0299c0b1")
    public static HwRAMAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwRAMAttribute.canInstantiate(obj))
        	return new HwRAMAttribute(obj);
        else
        	throw new IllegalArgumentException("HwRAMAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f565f1b6-c7fe-44e1-8b79-d8921a325b0a")
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
        HwRAMAttribute other = (HwRAMAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("457429f7-2d86-4549-ae83-ae6fa902f98d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwRAM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97eb856d-b9db-4f46-9f99-8537e1289b3b")
    public String getHwRAM_Attribute_organization() {
        return this.elt.getTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1e45420-94b5-4ed7-a942-e8b63e9dc40c")
    public String getHwRAM_Attribute_repl_Policy() {
        return this.elt.getTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwRAM_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2969a748-b7be-4434-a734-886e568307fd")
    public String getHwRAM_Attribute_writePolicy() {
        return this.elt.getTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT);
    }

    @objid ("e0b5ea36-f2dc-4edd-abac-28767faeebc5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwRAM_Attribute_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a356965-5c11-4f45-b8b5-ae090ff08929")
    public boolean isHwRAM_Attribute_isNonVolatile() {
        return this.elt.isTagged(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Attribute_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ee832d4-b409-442d-900c-b1d6363e8f3b")
    public boolean isHwRAM_Attribute_isStatic() {
        return this.elt.isTagged(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwRAM_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12db9dd4-f319-4eb7-94da-4320622aa743")
    public boolean isHwRAM_Attribute_isSynchronous() {
        return this.elt.isTagged(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Attribute_isNonVolatile'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7e72a84-a606-4f3f-a401-2bdc98a53e23")
    public void setHwRAM_Attribute_isNonVolatile(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Attribute_isStatic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e947ec99-d364-4747-a2b8-0424f585f645")
    public void setHwRAM_Attribute_isStatic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwRAM_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c2df401-a416-4150-8cfb-17d36cc24425")
    public void setHwRAM_Attribute_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwRAM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9aff0ccd-816c-49d5-b799-5b00a758f06c")
    public void setHwRAM_Attribute_organization(final String value) {
        this.elt.putTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Attribute_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f3fd62c-3fb9-463b-8050-9c5e32752649")
    public void setHwRAM_Attribute_repl_Policy(final String value) {
        this.elt.putTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwRAM_Attribute_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02410333-654a-4d88-9971-26508ca46295")
    public void setHwRAM_Attribute_writePolicy(final String value) {
        this.elt.putTagValue(HwRAMAttribute.MdaTypes.HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("5e9ff168-56e9-4f4a-8095-5de1e79ad1a0")
    protected HwRAMAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("9bf2034a-99ad-4107-bf6c-c6da2b64cd1c")
    public static final class MdaTypes {
        @objid ("4db59fa2-f6d9-46d5-8afc-9d5de46b2f8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("347f6f45-f173-4255-9bd8-32c0f4478329")
        public static TagType HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("7ca8d9e8-11ab-4ab4-bd42-22cfa01ec80a")
        public static TagType HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT;

        @objid ("3e936fe0-e5a4-4f02-8a62-1d38aba70dd1")
        public static TagType HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT;

        @objid ("d426b8f5-31d2-4bf4-b83a-a2755baf9fef")
        public static TagType HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("153ac0a3-fd5f-4611-9956-aab3b9d20ffa")
        public static TagType HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT;

        @objid ("06517c7d-6290-4c9c-abcf-8d53265ad51e")
        public static TagType HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT;

        @objid ("d79f3a94-3480-4371-9fcd-896c2450ba0a")
        private static Stereotype MDAASSOCDEP;

        @objid ("03881ee8-0ded-4d18-a105-a96d9dec1ba0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd9704b5-1c57-4035-bed6-819d97fe903a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01593e70-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0c2-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015ba0de-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "015e0313-0ccf-11df-8525-001302895b2b");
            HWRAM_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8c8f071-170f-11df-b92a-0014222a9f79");
            HWRAM_ATTRIBUTE_ISSTATIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8c8f072-170f-11df-b92a-0014222a9f79");
            HWRAM_ATTRIBUTE_ISNONVOLATILE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c8c8f073-170f-11df-b92a-0014222a9f79");
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
