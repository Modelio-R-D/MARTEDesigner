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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mapService_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("80b83632-0806-43f8-935a-d827c486daf3")
public class ProfileAssociationMapServiceMemoryBroker {
    @objid ("ad3a90b4-fee0-410e-a66d-84260522a5e7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mapService_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("911d0396-216f-4be1-a04b-cc4e8b1a45f8")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMapServiceMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mapService_MemoryBroker >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5d6ad79e-f0df-4661-940a-423357c2239c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMapServiceMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mapService_MemoryBroker >> then instantiate a {@link ProfileAssociationMapServiceMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationMapServiceMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("ef5aee37-dbc4-43f1-a962-7f1f33065ed5")
    public static ProfileAssociationMapServiceMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMapServiceMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationMapServiceMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMapServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mapService_MemoryBroker >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMapServiceMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("10ff1bfa-5cda-40a8-bb1a-2d410ca7e9e8")
    public static ProfileAssociationMapServiceMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationMapServiceMemoryBroker.canInstantiate(obj) ? new ProfileAssociationMapServiceMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMapServiceMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mapService_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMapServiceMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8ea37fe7-923f-4b38-89b8-ebb47d909564")
    public static ProfileAssociationMapServiceMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMapServiceMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationMapServiceMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMapServiceMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4da33127-7ec5-4950-847f-ff484ca6d4ae")
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
        ProfileAssociationMapServiceMemoryBroker other = (ProfileAssociationMapServiceMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("4eb9c3be-531e-460f-aef5-cd7a33219982")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0a76ada6-31be-4668-be03-b0992e43566d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("09afb615-7004-4aae-9062-88a9b8a954c3")
    protected ProfileAssociationMapServiceMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5cd1c62c-1b80-4aec-93ab-55e870f074a0")
    public static final class MdaTypes {
        @objid ("29a66ef6-6431-49b4-adaf-2d381b37211e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("688e3700-34b6-4605-906a-e1733d4c350a")
        private static Stereotype MDAASSOCDEP;

        @objid ("1fc8396b-ac4e-4c76-8d45-e9a97a0494e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("990fbd28-7815-4c48-a011-102f5fac5440")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e552d8c6-9759-11e0-94fb-0027103f347c");
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
