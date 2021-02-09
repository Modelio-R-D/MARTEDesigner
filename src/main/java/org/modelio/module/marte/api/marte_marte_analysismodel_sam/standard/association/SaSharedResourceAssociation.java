/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.MutualExclusionResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SaSharedResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaSharedResourceAssociation extends MutualExclusionResourceAssociation {
    public static final String STEREOTYPE_NAME = "SaSharedResource_Association";

    public static final String SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE = "SaSharedResource_Association_acquisT";

    public static final String SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE = "SaSharedResource_Association_capacity";

    public static final String SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE = "SaSharedResource_Association_isConsum";

    public static final String SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE = "SaSharedResource_Association_isPreemp";

    public static final String SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE = "SaSharedResource_Association_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SaSharedResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SaSharedResource_Association >> then instantiate a {@link SaSharedResourceAssociation} proxy.
     * 
     * @return a {@link SaSharedResourceAssociation} proxy on the created {@link Association}.
     */
    public static SaSharedResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociation.STEREOTYPE_NAME);
        return SaSharedResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAssociation} proxy from a {@link Association} stereotyped << SaSharedResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SaSharedResourceAssociation} proxy or <i>null</i>.
     */
    public static SaSharedResourceAssociation instantiate(final Association obj) {
        return SaSharedResourceAssociation.canInstantiate(obj) ? new SaSharedResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAssociation} proxy from a {@link Association} stereotyped << SaSharedResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SaSharedResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaSharedResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SaSharedResourceAssociation.canInstantiate(obj))
        	return new SaSharedResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaSharedResourceAssociation other = (SaSharedResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Association_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Association_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaSharedResource_Association_capacity() {
        return this.elt.getTagValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Association_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSharedResource_Association_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Association_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Association_isConsum() {
        return this.elt.isTagged(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Association_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaSharedResource_Association_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Association_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Association_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Association_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Association_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Association_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Association_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Association_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Association_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSharedResource_Association_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT, values);
    }

    protected SaSharedResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT;

        public static TagType SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "78104d4e-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "78104d51-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "78104d52-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "78104d53-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "78104d54-14ad-11df-9d54-0014222a9f79");
            SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "78104d4f-14ad-11df-9d54-0014222a9f79");
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
