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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_openServices_DeviceBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("47536897-b4a0-4619-97f3-5e1a3a039898")
public class ProfileAssociationOpenServicesDeviceBroker {
    @objid ("38359085-718b-465b-af75-890a5ffbff93")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_openServices_DeviceBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0f1432ad-5673-4faf-8f2a-5d09f76ac60f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOpenServicesDeviceBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("57150aab-fbec-4e7a-b090-b4a6f9b3306a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOpenServicesDeviceBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >> then instantiate a {@link ProfileAssociationOpenServicesDeviceBroker} proxy.
     * 
     * @return a {@link ProfileAssociationOpenServicesDeviceBroker} proxy on the created {@link Dependency}.
     */
    @objid ("e60563d4-c6a1-4536-b574-ea57d80fea04")
    public static ProfileAssociationOpenServicesDeviceBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOpenServicesDeviceBroker.STEREOTYPE_NAME);
        return ProfileAssociationOpenServicesDeviceBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOpenServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOpenServicesDeviceBroker} proxy or <i>null</i>.
     */
    @objid ("85c9da50-4930-4892-a478-bbde6514215d")
    public static ProfileAssociationOpenServicesDeviceBroker instantiate(final Dependency obj) {
        return ProfileAssociationOpenServicesDeviceBroker.canInstantiate(obj) ? new ProfileAssociationOpenServicesDeviceBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOpenServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_openServices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOpenServicesDeviceBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b965e4a8-79e5-4d89-bcb5-57d6772453ad")
    public static ProfileAssociationOpenServicesDeviceBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOpenServicesDeviceBroker.canInstantiate(obj))
        	return new ProfileAssociationOpenServicesDeviceBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOpenServicesDeviceBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b48d7de0-ce2a-453a-a07d-d9b45a0d448f")
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
        ProfileAssociationOpenServicesDeviceBroker other = (ProfileAssociationOpenServicesDeviceBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9a864709-70c4-4fe6-a675-056e3bf2e576")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("6a10f265-35b9-4f7a-ae4a-9cd7568191f9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("747f7de5-1846-44a1-964f-333bcdbde309")
    protected ProfileAssociationOpenServicesDeviceBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("22341ef5-cc95-4bd9-a848-34e0a1a72887")
    public static final class MdaTypes {
        @objid ("9bd80ad5-c01d-4fbb-902e-715148198ac2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82a52407-d0ee-49f0-b095-db01fca18fe1")
        private static Stereotype MDAASSOCDEP;

        @objid ("13819e7f-113f-41cd-a537-53ffa9a5c48d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d3a833b4-6eeb-4d43-984f-499a99963c78")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f2d5c41-9759-11e0-94fb-0027103f347c");
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
