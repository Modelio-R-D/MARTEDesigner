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
    @objid ("5dcfbde5-6ef9-4c53-bcee-420a304b9a88")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Association";

    @objid ("12bda3a9-653d-4d6f-945f-cb2812bc3600")
    public static final String SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE = "SaSharedResource_Association_acquisT";

    @objid ("736bafce-6242-407a-ab00-ef084f1fbae7")
    public static final String SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE = "SaSharedResource_Association_capacity";

    @objid ("33c8c07e-3cee-4fc6-913f-4f261af13545")
    public static final String SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE = "SaSharedResource_Association_isConsum";

    @objid ("8a48aa7b-b49a-432c-abfa-dd585de67699")
    public static final String SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE = "SaSharedResource_Association_isPreemp";

    @objid ("af4eecfb-d653-4e25-9b8d-ebd6ce495822")
    public static final String SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE = "SaSharedResource_Association_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SaSharedResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("df75e1c7-4f35-43ae-8b54-fc849f0e11df")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SaSharedResource_Association >> then instantiate a {@link SaSharedResourceAssociation} proxy.
     * 
     * @return a {@link SaSharedResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("b5b51fd1-3d02-46e2-814e-d24df2c848aa")
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
    @objid ("167dd9c3-fbc4-46f0-981c-900045c18c96")
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
    @objid ("c89f5425-ea14-4bdb-8faf-1261cf7bcd27")
    public static SaSharedResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SaSharedResourceAssociation.canInstantiate(obj))
        	return new SaSharedResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d32ead4-ccf0-4ecf-a810-4223e21c466b")
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
    @objid ("79febdf9-b52e-4128-b938-99002df8ea70")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Association_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dec139da-1841-4f57-90bf-027c94d6d74c")
    public List<String> getSaSharedResource_Association_acquisT() {
        return this.elt.getTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f485ee6-e111-4ea5-9904-a493fcded46b")
    public String getSaSharedResource_Association_capacity() {
        return this.elt.getTagValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Association_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c113d18a-88c4-4d66-8d76-8f36e7f04093")
    public List<String> getSaSharedResource_Association_releaseT() {
        return this.elt.getTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT);
    }

    @objid ("cabec298-2289-4067-b50e-857a22b873f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Association_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a2c7817-ce91-4c3b-97e8-d6f62ef527b0")
    public boolean isSaSharedResource_Association_isConsum() {
        return this.elt.isTagged(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Association_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3c6995a-c47a-4f9c-b2a4-a9f9a0e1c5ae")
    public boolean isSaSharedResource_Association_isPreemp() {
        return this.elt.isTagged(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Association_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("588347d8-899c-4a41-99a2-1554b07ff2c7")
    public void setSaSharedResource_Association_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d385261-74a5-4807-80c5-484ef830ee41")
    public void setSaSharedResource_Association_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Association_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66bf5a80-1e35-4fb7-8d6b-ffed75a00c1e")
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
    @objid ("9fb21080-20c6-4e1b-946e-2029b4db3ee9")
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
    @objid ("e77baccf-c429-44d8-9d91-90c6e1e8b1f5")
    public void setSaSharedResource_Association_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceAssociation.MdaTypes.SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("872bc6f2-a667-4704-b7e0-746d47f6a80d")
    protected SaSharedResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("c3f9539b-0711-4e1a-9ccc-5c13427cabbd")
    public static final class MdaTypes {
        @objid ("8f8f8347-39be-4976-b41d-0702030e73bf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("be7fa0c1-4b61-41b9-aebf-60634da876ed")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("e7b4cb80-0e45-4c2e-b821-446f45123011")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_ISPREEMP_TAGTYPE_ELT;

        @objid ("0021d296-1aeb-4b68-ac97-54146f5e4a4e")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_ISCONSUM_TAGTYPE_ELT;

        @objid ("cfbcda9d-c84f-4ee9-ba98-548d20e634bf")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_ACQUIST_TAGTYPE_ELT;

        @objid ("7213f673-7049-430f-ba8f-0a5e7ab3db58")
        public static TagType SASHAREDRESOURCE_ASSOCIATION_RELEASET_TAGTYPE_ELT;

        @objid ("147d6876-a401-44fc-a44a-bb203d9d6f9f")
        private static Stereotype MDAASSOCDEP;

        @objid ("cce0eee1-ebed-4a8a-8851-5950227747d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6ebed7f-3103-428b-a848-6accea4fc131")
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
