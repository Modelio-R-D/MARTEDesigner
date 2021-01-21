/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("34929c63-557e-4ef7-9cb9-51d85fa94a69")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Attribute";

    @objid ("15a37375-9f58-47d5-bd4b-572aa53b2bf9")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE = "SaSharedResource_Attribute_acquisT";

    @objid ("08173699-c5ff-41d2-a914-2da5345bcf5c")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE = "SaSharedResource_Attribute_capacity";

    @objid ("8e010868-63f6-42e7-930c-08b503205897")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE = "SaSharedResource_Attribute_isConsum";

    @objid ("aab26f59-f8e3-4471-820a-2b3d296169b7")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE = "SaSharedResource_Attribute_isPreemp";

    @objid ("936d6255-0553-49a2-8c91-7e725518f788")
    public static final String SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE = "SaSharedResource_Attribute_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SaSharedResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2b77a4ff-71cd-43cc-9655-f9e01dcb9048")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SaSharedResource_Attribute >> then instantiate a {@link SaSharedResourceAttribute} proxy.
     * 
     * @return a {@link SaSharedResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("1d59dd3e-ad60-493d-bcec-e3b64c95c56c")
    public static SaSharedResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAttribute.STEREOTYPE_NAME);
        return SaSharedResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAttribute} proxy from a {@link Attribute} stereotyped << SaSharedResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SaSharedResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("2df3defa-da02-4f09-9f37-4a17a8a9dff8")
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
    @objid ("19505645-8159-4e3a-ae4b-8b2d4641d8da")
    public static SaSharedResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SaSharedResourceAttribute.canInstantiate(obj))
        	return new SaSharedResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3ba7084a-c3c3-4f20-a073-a3dcbe641c11")
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
    @objid ("63690568-b8ac-41db-aa64-c4beba893a52")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Attribute_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f01affc8-d5a8-4e65-80dc-74216735d0bc")
    public List<String> getSaSharedResource_Attribute_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("394c8f4c-2797-4b11-8623-a81a17ed7c14")
    public String getSaSharedResource_Attribute_capacity() {
        return this.elt.getTagValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Attribute_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0e8044c9-efb8-4569-843b-ef9fcc44a1dd")
    public List<String> getSaSharedResource_Attribute_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT);
    }

    @objid ("759c1666-83c6-40c6-8350-7dd80079554a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Attribute_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e679547e-9915-45b3-8387-298180fb40ce")
    public boolean isSaSharedResource_Attribute_isConsum() {
        return this.elt.isTagged(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Attribute_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44aedd5b-1dc4-4181-a953-5e9ea77dd1b6")
    public boolean isSaSharedResource_Attribute_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Attribute_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab7d1c06-9399-455a-9cfc-0bad72c572f7")
    public void setSaSharedResource_Attribute_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("602cec0f-f940-4e84-8ef3-7fddfee3104c")
    public void setSaSharedResource_Attribute_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Attribute_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1048952c-9ca6-409c-aa05-28455803c2ec")
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
    @objid ("aab70f8a-954f-40a5-810c-13680b66c33d")
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
    @objid ("704568a5-2d03-4239-91a8-7f7515b6cb2b")
    public void setSaSharedResource_Attribute_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("727f2bde-618c-4e99-a02f-0e212c4fc4ea")
    protected SaSharedResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("5debb989-aa83-4b2d-8e60-30e87ea1fbd1")
    public static final class MdaTypes {
        @objid ("1d3433ad-5563-4500-9604-d0aedcc14a07")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f46ea21a-2278-4e49-a98b-9f29b0cb29a3")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        @objid ("38693c1d-f9c4-41c8-8f85-5ef4e230705e")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT;

        @objid ("6501016f-bd80-4560-96ad-70433c324ef5")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT;

        @objid ("e7ba7ae2-abf4-4190-ac27-d47e3fc474a5")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT;

        @objid ("dd91643e-5509-4093-96fe-ce2e50749291")
        public static TagType SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT;

        @objid ("a3385de5-f22e-4fa9-88d3-092ae273820d")
        private static Stereotype MDAASSOCDEP;

        @objid ("58946437-084c-455a-b6a3-fa0bbea35b38")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("af0c3664-980d-4280-bb0c-42faf39bac4d")
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
