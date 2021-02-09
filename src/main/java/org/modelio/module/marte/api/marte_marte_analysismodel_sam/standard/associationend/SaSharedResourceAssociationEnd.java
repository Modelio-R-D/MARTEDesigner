/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.MutualExclusionResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SaSharedResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaSharedResourceAssociationEnd extends MutualExclusionResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "SaSharedResource_AssociationEnd";

    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE = "SaSharedResource_AssociationEnd_acquisT";

    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE = "SaSharedResource_AssociationEnd_capacity";

    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE = "SaSharedResource_AssociationEnd_isConsum";

    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE = "SaSharedResource_AssociationEnd_isPreemp";

    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE = "SaSharedResource_AssociationEnd_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SaSharedResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SaSharedResource_AssociationEnd >> then instantiate a {@link SaSharedResourceAssociationEnd} proxy.
     * 
     * @return a {@link SaSharedResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static SaSharedResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociationEnd.STEREOTYPE_NAME);
        return SaSharedResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaSharedResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SaSharedResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static SaSharedResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SaSharedResourceAssociationEnd.canInstantiate(obj) ? new SaSharedResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaSharedResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SaSharedResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaSharedResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SaSharedResourceAssociationEnd.canInstantiate(obj))
        	return new SaSharedResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceAssociationEnd other = (SaSharedResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_AssociationEnd_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_AssociationEnd_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_AssociationEnd_capacity() {
        return this.elt.getTagValue(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_AssociationEnd_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_AssociationEnd_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_AssociationEnd_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_AssociationEnd_isConsum() {
        return this.elt.isTagged(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_AssociationEnd_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_AssociationEnd_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_AssociationEnd_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_AssociationEnd_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_AssociationEnd_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_AssociationEnd_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_AssociationEnd_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_AssociationEnd_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_AssociationEnd_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_AssociationEnd_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_AssociationEnd_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03956b4f-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b56-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b5d-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b64-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda4-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cdab-0ccf-11df-8525-001302895b2b");
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
