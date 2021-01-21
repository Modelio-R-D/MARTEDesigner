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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_closeServices_DeviceBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0bf84204-2e99-4673-8bee-3afd8472deb7")
public class ProfileAssociationCloseServicesDeviceBroker {
    @objid ("30e766ce-5d88-473e-b275-54aa96323ee9")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_closeServices_DeviceBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("59635190-7576-475c-b569-f720d4110d1e")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationCloseServicesDeviceBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_closeServices_DeviceBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1b337f1b-a00d-4ef4-8088-793e46657fd9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCloseServicesDeviceBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_closeServices_DeviceBroker >> then instantiate a {@link ProfileAssociationCloseServicesDeviceBroker} proxy.
     * 
     * @return a {@link ProfileAssociationCloseServicesDeviceBroker} proxy on the created {@link Dependency}.
     */
    @objid ("ef9663b2-fa0c-43e7-a9ed-7193466138b2")
    public static ProfileAssociationCloseServicesDeviceBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationCloseServicesDeviceBroker.STEREOTYPE_NAME);
        return ProfileAssociationCloseServicesDeviceBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCloseServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_closeServices_DeviceBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationCloseServicesDeviceBroker} proxy or <i>null</i>.
     */
    @objid ("c9c68e7c-2075-4a9f-a46c-c9e8b8012be6")
    public static ProfileAssociationCloseServicesDeviceBroker instantiate(final Dependency obj) {
        return ProfileAssociationCloseServicesDeviceBroker.canInstantiate(obj) ? new ProfileAssociationCloseServicesDeviceBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationCloseServicesDeviceBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_closeServices_DeviceBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationCloseServicesDeviceBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e79fa310-2b5a-4eaa-8fe2-8894f608c7ab")
    public static ProfileAssociationCloseServicesDeviceBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationCloseServicesDeviceBroker.canInstantiate(obj))
        	return new ProfileAssociationCloseServicesDeviceBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationCloseServicesDeviceBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eeebd2b5-3f35-43d3-89ae-dea8712b9237")
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
        ProfileAssociationCloseServicesDeviceBroker other = (ProfileAssociationCloseServicesDeviceBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9af425a9-1e35-4119-bbef-61827252304d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d02bd5ac-eef0-46e1-aef4-527d5392b65b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f123d3f9-7be8-44fa-a9ed-d9df12d38e06")
    protected ProfileAssociationCloseServicesDeviceBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("6b0a2223-e7bc-4db9-ae50-10c714255dcf")
    public static final class MdaTypes {
        @objid ("2be51ce1-983f-49cf-ae3f-19915988a1f7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("da3396a1-ee09-43b0-aa05-391cc57481d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("e17d77ff-fdd1-4556-aa93-21e57aaa79aa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("67f0b6b8-beef-4836-ae4f-c1ff148e04b0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5d3cc4c2-9759-11e0-94fb-0027103f347c");
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
