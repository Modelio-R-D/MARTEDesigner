/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_collectionAttrib_CollectionType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5e546797-d241-4449-9587-b0c1304b7c34")
public class ProfileAssociationCollectionAttribCollectionTypeAttribute {
    @objid ("f6f4cf57-38b4-40bb-bfd7-9b7dc3a944e3")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_collectionAttrib_CollectionType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("690c0420-b4a0-478a-8514-6c232f536b5f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_collectionAttrib_CollectionType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b855075c-0da2-4721-b115-e6fe5d693a2e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCollectionAttribCollectionTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_collectionAttrib_CollectionType_Attribute >> then instantiate a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("49e6d305-d9a9-47da-9673-c35ada9deec6")
    public static ProfileAssociationCollectionAttribCollectionTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCollectionAttribCollectionTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationCollectionAttribCollectionTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_collectionAttrib_CollectionType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("9a67b084-1237-4305-ba7c-85a363c10b24")
    public static ProfileAssociationCollectionAttribCollectionTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationCollectionAttribCollectionTypeAttribute.canInstantiate(obj) ? new ProfileAssociationCollectionAttribCollectionTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_collectionAttrib_CollectionType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c66eefdd-9343-4fa7-87d6-9cca8d8935ba")
    public static ProfileAssociationCollectionAttribCollectionTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationCollectionAttribCollectionTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationCollectionAttribCollectionTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationCollectionAttribCollectionTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9f2865d6-1347-4939-82e8-be343ce2d4af")
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
        ProfileAssociationCollectionAttribCollectionTypeAttribute other = (ProfileAssociationCollectionAttribCollectionTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("a72dc91e-26f7-4be2-98e2-c94e4535a03c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5b708d91-312b-44fb-8d32-e481d1d2bd4b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4e17c1db-c314-415a-9f5e-7a5ddb827612")
    protected ProfileAssociationCollectionAttribCollectionTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("419a9f16-2c50-4a60-a2ae-99717124dfde")
    public static final class MdaTypes {
        @objid ("19e23639-e458-43be-8865-6a9eed76ff4e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3362ef9-1f4f-4634-a26b-ec0699be09ea")
        private static Stereotype MDAASSOCDEP;

        @objid ("60dc1dc1-a511-4729-b9b4-94421f99daf7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("808455bd-cd0d-4c6b-a197-df916f731de8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d7b0443c-82b2-11df-b65a-0014222a9f79");
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
