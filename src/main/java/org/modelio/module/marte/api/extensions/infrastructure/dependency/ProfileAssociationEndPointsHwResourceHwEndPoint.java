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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_endPoints_HwResource_HwEndPoint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("761cc6cc-eb82-481d-b265-468e3d7aa46d")
public class ProfileAssociationEndPointsHwResourceHwEndPoint {
    @objid ("e9120c7a-d01b-422e-811b-4bba76bb6aa9")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_endPoints_HwResource_HwEndPoint";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("db563d28-49f7-4f1b-b613-1527415d1107")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationEndPointsHwResourceHwEndPoint proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_endPoints_HwResource_HwEndPoint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d59b6cb4-2215-4060-87c2-e4415f22d35d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEndPointsHwResourceHwEndPoint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_endPoints_HwResource_HwEndPoint >> then instantiate a {@link ProfileAssociationEndPointsHwResourceHwEndPoint} proxy.
     * 
     * @return a {@link ProfileAssociationEndPointsHwResourceHwEndPoint} proxy on the created {@link Dependency}.
     */
    @objid ("4adccec7-822c-42d5-892a-cb637835851b")
    public static ProfileAssociationEndPointsHwResourceHwEndPoint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEndPointsHwResourceHwEndPoint.STEREOTYPE_NAME);
        return ProfileAssociationEndPointsHwResourceHwEndPoint.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationEndPointsHwResourceHwEndPoint} proxy from a {@link Dependency} stereotyped << ProfileAssociation_endPoints_HwResource_HwEndPoint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationEndPointsHwResourceHwEndPoint} proxy or <i>null</i>.
     */
    @objid ("43d1786e-4123-4887-89f0-3fca31708ac9")
    public static ProfileAssociationEndPointsHwResourceHwEndPoint instantiate(final Dependency obj) {
        return ProfileAssociationEndPointsHwResourceHwEndPoint.canInstantiate(obj) ? new ProfileAssociationEndPointsHwResourceHwEndPoint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationEndPointsHwResourceHwEndPoint} proxy from a {@link Dependency} stereotyped << ProfileAssociation_endPoints_HwResource_HwEndPoint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationEndPointsHwResourceHwEndPoint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("881b7e9c-88d6-4180-b9bb-fef241ab0681")
    public static ProfileAssociationEndPointsHwResourceHwEndPoint safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationEndPointsHwResourceHwEndPoint.canInstantiate(obj))
        	return new ProfileAssociationEndPointsHwResourceHwEndPoint(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationEndPointsHwResourceHwEndPoint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f29267c7-c8a4-4dda-8b99-af2d39d41be4")
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
        ProfileAssociationEndPointsHwResourceHwEndPoint other = (ProfileAssociationEndPointsHwResourceHwEndPoint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("3c85f773-b79a-4143-a716-26417545866d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("53f20a6a-69b6-4c5d-9dfe-48483fdb66e9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7ea04358-96f5-4ca9-98ec-ca2481af5248")
    protected ProfileAssociationEndPointsHwResourceHwEndPoint(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c93adf26-fe0b-48dc-b014-21bb4a0606ff")
    public static final class MdaTypes {
        @objid ("159aaea9-7e71-46bd-b12f-b851cedf919f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aea57787-5b94-4343-b16c-89aaa29de6e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("89e5a15e-57b8-4222-8b2b-ef23c0746b32")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("523f498d-9b27-4b09-b1fe-5d0ed8406702")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a9030c50-937d-11e0-b960-0027103f347c");
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
