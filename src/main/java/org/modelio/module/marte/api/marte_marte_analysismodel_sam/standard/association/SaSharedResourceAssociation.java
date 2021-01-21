/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association;

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
@objid ("45694666-c5e6-4975-8f59-da8ea1da7030")
public class SaSharedResourceAssociation extends MutualExclusionResourceAssociation {
    @objid ("e5cf9bfa-1adb-4db4-834d-2f92b24ccffa")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Association";

    @objid ("6faed560-70a0-4ad7-82d4-016f07a7153d")
    public static final String SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE = "SaSharedResource_Association_acquisT";

    @objid ("78752e13-a060-4f3d-ae41-d463c7072bfe")
    public static final String SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE = "SaSharedResource_Association_capacity";

    @objid ("d892b8f3-d6c3-4b29-b7f9-e9496f4e6dba")
    public static final String SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE = "SaSharedResource_Association_isConsum";

    @objid ("58524d60-370a-445f-a7fe-67b5137ae63f")
    public static final String SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE = "SaSharedResource_Association_isPreemp";

    @objid ("7b7122b1-7bf3-4025-8ca3-64ea79542238")
    public static final String SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE = "SaSharedResource_Association_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SaSharedResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7087070d-a441-4bab-9181-764875d0d9dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SaSharedResource_Association >> then instantiate a {@link SaSharedResourceAssociation} proxy.
     * 
     * @return a {@link SaSharedResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("447a11ae-dfb9-4a19-a991-61ce7569fe61")
    public static SaSharedResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociation.STEREOTYPE_NAME);
        return SaSharedResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAssociation} proxy from a {@link Association} stereotyped << SaSharedResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SaSharedResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("857123a3-4a5c-49c2-afa0-d1feab048216")
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
    @objid ("b5ef566b-04c4-4418-b5c0-14294cf81356")
    public static SaSharedResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SaSharedResourceAssociation.canInstantiate(obj))
        	return new SaSharedResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("90679e06-524c-4e0d-a961-4869d7ea547c")
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
    @objid ("369281a4-0348-4aad-acd6-c1b5a897433e")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Association_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ad63f0c1-7d19-422d-acdd-655ccf00584e")
    public List<String> getSaSharedResource_Association_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4639a83-e3fc-42b3-ba2b-8fe8910f2e70")
    public String getSaSharedResource_Association_capacity() {
        return this.elt.getTagValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Association_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c2300f0d-6ef6-482e-9971-20159fb1f7a7")
    public List<String> getSaSharedResource_Association_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT);
    }

    @objid ("58c8ebae-6b10-44a2-b076-ed4660ae988d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Association_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc133f95-95e7-4188-add4-b0129d5e86f7")
    public boolean isSaSharedResource_Association_isConsum() {
        return this.elt.isTagged(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Association_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd28a2e5-0561-438c-afa8-b968b906b9be")
    public boolean isSaSharedResource_Association_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Association_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d000ab27-6831-44e1-ae14-440fa13d76ee")
    public void setSaSharedResource_Association_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("11334e05-0252-4e0c-ba37-ec855f958be3")
    public void setSaSharedResource_Association_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Association_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98d6fec1-c96a-4521-be34-1b16c6a35e61")
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
    @objid ("bfafd0b3-796c-4b83-a889-b0df50500266")
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
    @objid ("ba96c1cd-5a4a-41ab-a58c-e98190c4bcbf")
    public void setSaSharedResource_Association_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("16fa2a1d-7cee-40f8-8921-b1e4cc58309b")
    protected SaSharedResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("c3f9539b-0711-4e1a-9ccc-5c13427cabbd")
    public static final class MdaTypes {
        @objid ("b3f5a85a-ae15-4f18-bc92-fc02dbee3896")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c320382-8681-4d33-8d36-066599b27a4d")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("a1b71d36-db78-45df-b732-f0375188b20d")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT;

        @objid ("7d169e83-1e1d-43a7-a03c-ac8e2be85264")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT;

        @objid ("a57e54a2-3396-4b72-b816-f3a2906de613")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT;

        @objid ("5c76188b-309b-4dc0-bfe8-df48538211ed")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT;

        @objid ("5e598068-bacf-4d21-be2f-f13b788a4f30")
        private static Stereotype MDAASSOCDEP;

        @objid ("93ea7c33-f239-4a7b-b0dc-2f066cffce56")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77f0cd5c-d3c5-4cc3-89dc-19e6eff73da6")
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
