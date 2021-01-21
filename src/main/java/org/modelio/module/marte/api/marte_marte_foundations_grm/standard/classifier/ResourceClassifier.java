/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << Resource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9c3960ed-19a2-48d5-8ddf-e4eb88c58bf5")
public class ResourceClassifier {
    @objid ("89c146c2-eb62-4e27-8906-a55ce949cf39")
    public static final String STEREOTYPE_NAME = "Resource_Classifier";

    @objid ("a497c091-961e-4438-bebd-4fc9d7ae7761")
    public static final String RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE = "Resource_Classifier_isActive";

    @objid ("31488bc0-4b41-48e0-8940-e1b91ac4eeb3")
    public static final String RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE = "Resource_Classifier_isProtected";

    @objid ("54dfd319-1fe5-4e23-ba36-f83be2010328")
    public static final String RESOURCE_CLASSIFIER_RESMULT_TAGTYPE = "Resource_Classifier_resMult";

    /**
     * The underlying {@link Classifier} represented by this proxy, never null.
     */
    @objid ("61c43ba4-3cbd-4fd3-a24d-ab737c3ee120")
    protected final Classifier elt;

    /**
     * Tells whether a {@link ResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << Resource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("eed0e942-83d2-4264-86d7-abc0506ac746")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << Resource_Classifier >> then instantiate a {@link ResourceClassifier} proxy.
     * 
     * @return a {@link ResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("b11938db-41fe-41b4-9668-e104f215b731")
    public static ResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceClassifier.STEREOTYPE_NAME);
        return ResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link ResourceClassifier} proxy from a {@link Classifier} stereotyped << Resource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link ResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("e50ed2e2-92b6-48aa-9b7d-8ce9516f87b4")
    public static ResourceClassifier instantiate(final Classifier obj) {
        return ResourceClassifier.canInstantiate(obj) ? new ResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceClassifier} proxy from a {@link Classifier} stereotyped << Resource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link ResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("464c8aa2-d42f-4a04-a15b-4c6c175d8af9")
    public static ResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (ResourceClassifier.canInstantiate(obj))
        	return new ResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("ResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ae944b59-5004-4fb3-91c5-52df92faf0ce")
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
        ResourceClassifier other = (ResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("ff9a0c61-cb4e-4482-9fda-c93d0fe47296")
    public Classifier getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Classifier_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb9c14ec-60f7-400b-859c-8bf272beda02")
    public String getResource_Classifier_resMult() {
        return this.elt.getTagValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT);
    }

    @objid ("04e33ec2-8d5b-431a-8ae3-e9235bd86623")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Classifier_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("330c34cd-17e0-42fa-8d48-89819a363ef6")
    public boolean isResource_Classifier_isActive() {
        return this.elt.isTagged(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Classifier_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a7764ca0-cfa3-49c2-91a9-e65009b789ed")
    public boolean isResource_Classifier_isProtected() {
        return this.elt.isTagged(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Classifier_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("128f6dee-d9d2-49aa-a9d1-6845b9abb15c")
    public void setResource_Classifier_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Classifier_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce6ff3c7-d3d9-4481-88c4-86a182b48ff3")
    public void setResource_Classifier_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Classifier_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7b376dd1-aacd-4598-b5c9-414ef02f1eb8")
    public void setResource_Classifier_resMult(final String value) {
        this.elt.putTagValue(ResourceClassifier.MdaTypes.RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("cf91dbbc-53aa-4a27-a2f3-b02c815bb286")
    protected ResourceClassifier(final Classifier elt) {
        this.elt = elt;
    }

    @objid ("d848f5e8-1af3-43eb-8479-d12723253687")
    public static final class MdaTypes {
        @objid ("bf570e7a-cb14-45a6-979f-c8baf2fe598e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3fff0775-a102-4f55-9f15-a057cd709617")
        public static TagType RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT;

        @objid ("2894e42c-a085-4130-8460-6974542da525")
        public static TagType RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT;

        @objid ("0e7aa85f-aabb-4207-b733-025986be1e19")
        public static TagType RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT;

        @objid ("04061ce4-8d87-45e5-ad80-05f9e2ccc598")
        private static Stereotype MDAASSOCDEP;

        @objid ("ecc6bed8-fc77-4714-af32-8ae6c1a2b0b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd6ad339-8c1f-41a2-b50e-c3d091e35a8e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7fc9127e-101a-11df-86fe-0014222a9f79");
            RESOURCE_CLASSIFIER_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bb9a838-101a-11df-86fe-0014222a9f79");
            RESOURCE_CLASSIFIER_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bb9a839-101a-11df-86fe-0014222a9f79");
            RESOURCE_CLASSIFIER_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8bb9a83a-101a-11df-86fe-0014222a9f79");
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
