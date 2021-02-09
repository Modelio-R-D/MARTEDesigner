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
public class SaSharedResourceAttribute extends MutualExclusionResourceAttribute {
    public static final String STEREOTYPE_NAME = "SaSharedResource_Attribute";

    public static final String SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE = "SaSharedResource_Attribute_acquisT";

    public static final String SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE = "SaSharedResource_Attribute_capacity";

    public static final String SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE = "SaSharedResource_Attribute_isConsum";

    public static final String SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE = "SaSharedResource_Attribute_isPreemp";

    public static final String SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE = "SaSharedResource_Attribute_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SaSharedResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SaSharedResource_Attribute >> then instantiate a {@link SaSharedResourceAttribute} proxy.
     * 
     * @return a {@link SaSharedResourceAttribute} proxy on the created {@link Attribute}.
     */
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
    public static SaSharedResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SaSharedResourceAttribute.canInstantiate(obj))
        	return new SaSharedResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceAttribute other = (SaSharedResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Attribute_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Attribute_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_Attribute_capacity() {
        return this.elt.getTagValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Attribute_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Attribute_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Attribute_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Attribute_isConsum() {
        return this.elt.isTagged(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Attribute_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Attribute_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Attribute_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Attribute_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Attribute_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Attribute_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Attribute_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setSaSharedResource_Attribute_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAttribute.MdaTypes.SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ATTRIBUTE_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ATTRIBUTE_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ATTRIBUTE_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
