/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.MutualExclusionResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SaSharedResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c1589d93-b3fc-4764-be95-b829332250d3")
public class SaSharedResourceAttribute extends MutualExclusionResourceAttribute {
    @objid ("8d6973d7-530b-4656-ba91-a8fd2f401c0a")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Attribute";

    @objid ("d7daf867-0f75-40a6-ac57-0232a21ce1df")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE = "SaSharedResource_Attribute_acquisT";

    @objid ("e7f6f6f1-d45d-4dc1-9e0e-468b6a213d0f")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE = "SaSharedResource_Attribute_capacity";

    @objid ("f639b34b-b352-49f0-9090-fe343f1bf2e9")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE = "SaSharedResource_Attribute_isConsum";

    @objid ("433699cf-bc8f-489c-bf48-1f0f59263e30")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE = "SaSharedResource_Attribute_isPreemp";

    @objid ("2e65f264-4835-406a-888d-66f261ae0456")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE = "SaSharedResource_Attribute_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SaSharedResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bb60705a-ff0d-4199-a397-6823849d76bc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SaSharedResource_Attribute >> then instantiate a {@link SaSharedResourceAttribute} proxy.
     * 
     * @return a {@link SaSharedResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("860bca73-c852-4dba-9eaa-1a3bf5a78f11")
    public static SaSharedResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAttribute.STEREOTYPE_NAME);
        return SaSharedResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAttribute} proxy from a {@link Attribute} stereotyped << SaSharedResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SaSharedResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("1a596b72-f5b1-4c95-a31c-0bd512da5a75")
    public static SaSharedResourceAttribute instantiate(final Attribute obj) {
        return SaSharedResourceAttribute.canInstantiate(obj) ? new SaSharedResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAttribute} proxy from a {@link Attribute} stereotyped << SaSharedResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SaSharedResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b597c243-040f-41bc-aa70-68a026629066")
    public static SaSharedResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SaSharedResourceAttribute.canInstantiate(obj))
        	return new SaSharedResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7bf5e34d-5e13-4267-a046-65b8741d99ec")
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
        SaSharedResourceAttribute other = (SaSharedResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("66e616ef-5ef9-4529-a2cb-c93abec34199")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Attribute_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e0182845-a064-4d45-b600-9b8b94d09305")
    public List<String> getSaSharedResource_Attribute_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f4058fb-7484-4dfd-a04e-7ff1825ae406")
    public String getSaSharedResource_Attribute_capacity() {
        return this.elt.getTagValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Attribute_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("70ca98c0-d269-4858-b3f5-4c0af53acdae")
    public List<String> getSaSharedResource_Attribute_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT);
    }

    @objid ("82964abb-b6c7-48bd-a5b0-e3d00e8f3d0e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Attribute_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d529c5bf-eb38-4a83-a4b5-59364e85500f")
    public boolean isSaSharedResource_Attribute_isConsum() {
        return this.elt.isTagged(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Attribute_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a7c0eec-b6e7-4ab8-859c-75b6070e91a6")
    public boolean isSaSharedResource_Attribute_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Attribute_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28e8ac9a-9897-4ec4-b120-de9532eda0e9")
    public void setSaSharedResource_Attribute_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff5e0751-eb29-400e-8e2c-9a768e89c593")
    public void setSaSharedResource_Attribute_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Attribute_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("123a370c-309e-4a58-84dc-e95cbaab366b")
    public void setSaSharedResource_Attribute_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Attribute_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("67ccd3a6-5d4b-4cfd-a52c-564741ba20da")
    public void setSaSharedResource_Attribute_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Attribute_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("097ea2c0-d2b5-409f-9e14-02a430b7142e")
    public void setSaSharedResource_Attribute_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("ef69b96c-84be-4cfc-9e03-03bbce8157ae")
    protected SaSharedResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("5debb989-aa83-4b2d-8e60-30e87ea1fbd1")
    public static final class MdaTypes {
        @objid ("695eb2b2-8251-466e-97be-cc80568c5852")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a644ebfb-6720-4c43-89b6-032112f81dda")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("9c0f9e31-45a4-4a00-bbc8-73f06561c668")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT;

        @objid ("9ded837c-0b37-49c9-a962-4a3c445aa514")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT;

        @objid ("c8e7b191-ef13-4ac4-8cd7-3cb1d8a28da4")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT;

        @objid ("ba6d2257-1b20-4ebf-a8b1-5e745f1105bb")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT;

        @objid ("75d039aa-37a2-4d10-93ba-71d7a17670d1")
        private static Stereotype MDAASSOCDEP;

        @objid ("6fcafa9d-ebd5-41d0-8424-b25b0e24d11d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1407408-b9d5-451b-a859-9b15857cbd5e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03956b51-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b58-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b5f-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b66-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda6-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cdad-0ccf-11df-8525-001302895b2b");
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
