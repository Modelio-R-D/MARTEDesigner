/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("a9e8bf22-d2c8-49e8-a62a-32df25284ac1")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_collectionAttrib_CollectionType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("b6e78497-83ec-4866-be0a-bcf8de01cc51")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_collectionAttrib_CollectionType_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("28596612-4f49-42b5-b005-93d1e232aa4c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCollectionAttribCollectionTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_collectionAttrib_CollectionType_Attribute >> then instantiate a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("56a5f398-f413-4a76-836d-6e2909d15b1e")
    public static ProfileAssociationCollectionAttribCollectionTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCollectionAttribCollectionTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationCollectionAttribCollectionTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_collectionAttrib_CollectionType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationCollectionAttribCollectionTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("1e235fda-8870-4ce2-8a3a-82c688476f31")
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
    @objid ("3400ca54-7b81-40a1-bef6-8ed2381da5ab")
    public static ProfileAssociationCollectionAttribCollectionTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationCollectionAttribCollectionTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationCollectionAttribCollectionTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationCollectionAttribCollectionTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7d390d89-2153-476b-ada5-24b436c28ed6")
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
    @objid ("591de588-cc34-4538-b996-ed59cf87a14c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("79099055-928d-4433-80ff-faf819d30c25")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7c0f3a30-fc96-4fb5-a9ef-bacf9e40c197")
    protected ProfileAssociationCollectionAttribCollectionTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("419a9f16-2c50-4a60-a2ae-99717124dfde")
    public static final class MdaTypes {
        @objid ("73131329-3574-466f-adf3-13af031d39cc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd6a9dfe-6453-4501-a10f-2b3314936116")
        private static Stereotype MDAASSOCDEP;

        @objid ("14317a2e-b7b0-4563-a6c1-feed20dfa5dd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88151744-55b1-4ed2-a329-4bc3e7396cb0")
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
