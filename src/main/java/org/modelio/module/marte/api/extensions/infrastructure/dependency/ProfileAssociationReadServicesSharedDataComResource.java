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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_readServices_SharedDataComResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a6c3cead-9451-45b1-b1ab-e3f299bb9fdd")
public class ProfileAssociationReadServicesSharedDataComResource {
    @objid ("932f7ea8-4aae-472d-bc8c-87cafc5f11ae")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_readServices_SharedDataComResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("fd2a4c87-2a2e-4e10-bb40-0ca4dcab6963")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationReadServicesSharedDataComResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_readServices_SharedDataComResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("23d46f0e-73c1-47c1-9f50-32c4fffc07f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReadServicesSharedDataComResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_readServices_SharedDataComResource >> then instantiate a {@link ProfileAssociationReadServicesSharedDataComResource} proxy.
     * 
     * @return a {@link ProfileAssociationReadServicesSharedDataComResource} proxy on the created {@link Dependency}.
     */
    @objid ("a53f5600-b9d4-4bc8-b971-425b21a00851")
    public static ProfileAssociationReadServicesSharedDataComResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationReadServicesSharedDataComResource.STEREOTYPE_NAME);
        return ProfileAssociationReadServicesSharedDataComResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReadServicesSharedDataComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_readServices_SharedDataComResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationReadServicesSharedDataComResource} proxy or <i>null</i>.
     */
    @objid ("7671b9ee-2e01-4e67-8448-8f305fc09ea6")
    public static ProfileAssociationReadServicesSharedDataComResource instantiate(final Dependency obj) {
        return ProfileAssociationReadServicesSharedDataComResource.canInstantiate(obj) ? new ProfileAssociationReadServicesSharedDataComResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationReadServicesSharedDataComResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_readServices_SharedDataComResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationReadServicesSharedDataComResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c20f5fca-e822-4ef3-9724-a3f35d1e087a")
    public static ProfileAssociationReadServicesSharedDataComResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationReadServicesSharedDataComResource.canInstantiate(obj))
        	return new ProfileAssociationReadServicesSharedDataComResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationReadServicesSharedDataComResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("778a9e31-36cf-4dd3-a204-439170cb66e2")
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
        ProfileAssociationReadServicesSharedDataComResource other = (ProfileAssociationReadServicesSharedDataComResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("abdfac1f-9d30-4314-8784-cfd592af037a")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("19bf02bb-4186-495f-abbb-da17648e43ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("770907b9-7a38-4d8a-9fcb-e8a721ae16d8")
    protected ProfileAssociationReadServicesSharedDataComResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("1c4d2251-271e-44f1-bcc6-8523dc9be820")
    public static final class MdaTypes {
        @objid ("66306c82-5eda-4863-bbd2-15eb54d8aef4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("22e3dd30-628f-4705-82c8-4c3f7d9b8a9a")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e0ac3b6-d531-42ff-87c7-92bae738b7d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("83fafc37-669c-4fb2-89a6-4f8ff91ed98b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6d76e60a-9758-11e0-94fb-0027103f347c");
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
