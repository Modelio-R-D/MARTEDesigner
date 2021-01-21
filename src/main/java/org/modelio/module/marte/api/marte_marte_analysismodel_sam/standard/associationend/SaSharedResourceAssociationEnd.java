/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.associationend;

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
@objid ("904f229d-e7f2-48a3-a41b-2861c6242c08")
public class SaSharedResourceAssociationEnd extends MutualExclusionResourceAssociationEnd {
    @objid ("951ffdae-0aaf-45d7-a46d-3a9e0a4ecda1")
    public static final String STEREOTYPE_NAME = "SaSharedResource_AssociationEnd";

    @objid ("5202c0b0-5320-4bfe-8d7f-0be97fd47e01")
    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE = "SaSharedResource_AssociationEnd_acquisT";

    @objid ("bd707992-c38d-4221-8e3c-78a7df11fc0a")
    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE = "SaSharedResource_AssociationEnd_capacity";

    @objid ("343fb41c-1458-43fe-90eb-c50505a65f96")
    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE = "SaSharedResource_AssociationEnd_isConsum";

    @objid ("7aa22d56-f51d-4299-b818-40aec7088eef")
    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE = "SaSharedResource_AssociationEnd_isPreemp";

    @objid ("a92f8c5b-06f0-4f20-bd4e-a4659a721b35")
    public static final String SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE = "SaSharedResource_AssociationEnd_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SaSharedResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2c919d26-29b1-45e8-bc94-38e1849fc600")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SaSharedResource_AssociationEnd >> then instantiate a {@link SaSharedResourceAssociationEnd} proxy.
     * 
     * @return a {@link SaSharedResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("cf8eae45-3140-48e0-8192-3ef0c110d8c6")
    public static SaSharedResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociationEnd.STEREOTYPE_NAME);
        return SaSharedResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SaSharedResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SaSharedResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("5bde6022-f650-4f15-b361-c7697c5b6d76")
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
    @objid ("6e8b5473-873b-44a5-b0a9-74f7367c1c26")
    public static SaSharedResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SaSharedResourceAssociationEnd.canInstantiate(obj))
        	return new SaSharedResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("321b3644-01e3-4c94-816d-fb01ad2c3cc1")
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
    @objid ("6682ec76-3c8f-4e9c-aac4-f9e4c2b91cba")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_AssociationEnd_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f67acd7b-76ba-46f6-8b13-94f1c0db5390")
    public List<String> getSaSharedResource_AssociationEnd_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66b46f5f-ebb4-47e8-a776-ab0fbbd1811b")
    public String getSaSharedResource_AssociationEnd_capacity() {
        return this.elt.getTagValue(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_AssociationEnd_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("319ef531-22fa-4e3d-8baf-80ec7eb5cbe2")
    public List<String> getSaSharedResource_AssociationEnd_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE_ELT);
    }

    @objid ("7a8cc7e5-360e-40ac-b03d-bf770497451b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_AssociationEnd_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("960fbfdb-e3a3-4583-a819-aef6bc8e861a")
    public boolean isSaSharedResource_AssociationEnd_isConsum() {
        return this.elt.isTagged(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_AssociationEnd_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd0a401b-90d3-458a-a6ce-4744c4e05417")
    public boolean isSaSharedResource_AssociationEnd_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_AssociationEnd_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("213d2e87-e9a8-4f19-9cec-d55383c60469")
    public void setSaSharedResource_AssociationEnd_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("964c563a-0aaf-4fba-a46c-32d4397f0778")
    public void setSaSharedResource_AssociationEnd_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_AssociationEnd_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ebcc7c57-d849-498e-a1f2-633f943a8886")
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
    @objid ("4f0fb463-fa4b-4717-b8cf-39794b01027d")
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
    @objid ("dd1cf4fb-644b-45ff-ad78-a40acb97a0a4")
    public void setSaSharedResource_AssociationEnd_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociationEnd.MdaTypes.SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("e9bea992-860d-486d-b68f-2775b52d12a7")
    protected SaSharedResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("30c7a23c-7515-4f92-84db-c941bbfe899c")
    public static final class MdaTypes {
        @objid ("d54ded9e-4260-44e6-a015-d05710e3a864")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b59e9293-2456-4ca6-a93d-5622776001b9")
        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("f0ff3ac0-bc57-4eee-b194-673d58258a3c")
        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_ISPREEMP_TAGTYPE_ELT;

        @objid ("d7b03591-8ae9-4af2-8424-5c3ef16e72a2")
        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_ISCONSUM_TAGTYPE_ELT;

        @objid ("b743cb74-c3af-419b-99f9-82b6a27a44cc")
        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_ACQUIST_TAGTYPE_ELT;

        @objid ("5806bca9-eead-4a83-ac40-932da38e0ecf")
        public static TagType SASHAREDRESOURCE_ASSOCIATIONEND_RELEASET_TAGTYPE_ELT;

        @objid ("3a54a57e-bb12-426c-91df-30df213f70e5")
        private static Stereotype MDAASSOCDEP;

        @objid ("6645ac2f-5d41-4f43-8981-b68b52a9960c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44735fb1-30a7-4001-b792-5905ef38cf36")
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
