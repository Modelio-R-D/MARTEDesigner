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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a76022a1-ef10-4000-8c86-f768453c2c75")
public class ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification {
    @objid ("da45e8de-4942-4b67-99aa-07400698a8ec")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("2675c682-83f2-4ff4-b407-da4f674a7a92")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0f5d6f1a-346a-4e50-90c1-ecef44b9fb06")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >> then instantiate a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy.
     * 
     * @return a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy on the created {@link Dependency}.
     */
    @objid ("94b90c28-e8af-4036-b2e7-0c442bbacc49")
    public static ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.STEREOTYPE_NAME);
        return ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy from a {@link Dependency} stereotyped << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy or <i>null</i>.
     */
    @objid ("9e3af674-824b-4db9-95e5-af8ee7e7a386")
    public static ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification instantiate(final Dependency obj) {
        return ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.canInstantiate(obj) ? new ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy from a {@link Dependency} stereotyped << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9e3d966c-43f1-4fab-8e6f-0a92768400f9")
    public static ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.canInstantiate(obj))
        	return new ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5c00f67e-9feb-4c45-9bfa-ad0e16db5aa4")
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
        ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification other = (ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("a7157012-a253-4201-971c-de3c05e2b02b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("468ad8bc-d4e8-4787-b52a-2e9977c1e825")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("48bc995d-3d7a-405a-afbe-2df247a82483")
    protected ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f5d48e0d-dcef-438c-b7d3-3bcf24c20ccc")
    public static final class MdaTypes {
        @objid ("6b2ee81f-7204-432b-97e7-9e2fc5de693a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b600e877-7c07-4625-b2a0-51129b92541f")
        private static Stereotype MDAASSOCDEP;

        @objid ("d70319e6-3f76-46b3-a3a5-648f3410c28f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f39a4a73-64c5-4d3b-babd-320a2bfbca7e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "382c04db-98c1-11e0-aed9-0027103f347c");
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
