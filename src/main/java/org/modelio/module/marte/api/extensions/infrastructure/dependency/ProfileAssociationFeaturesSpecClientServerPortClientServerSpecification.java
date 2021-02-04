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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a76022a1-ef10-4000-8c86-f768453c2c75")
public class ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification {
    @objid ("1d415a57-91ad-4c0b-915b-1dadf8bf6a3a")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("0cff343c-a422-4c8b-ac68-9b467528ad14")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("16f33fa8-0403-4fb2-bad9-9bd840f91496")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >> then instantiate a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy.
     * 
     * @return a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy on the created {@link Dependency}.
     */
    @objid ("6e5520a7-552f-43c8-9060-0add72d2a9e3")
    public static ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.STEREOTYPE_NAME);
        return ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy from a {@link Dependency} stereotyped << ProfileAssociation_featuresSpec_ClientServerPort_ClientServerSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification} proxy or <i>null</i>.
     */
    @objid ("47668844-7659-44cc-af38-f5f14451aa5b")
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
    @objid ("233dc0ef-4305-402f-9d83-91ef7375a375")
    public static ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification.canInstantiate(obj))
        	return new ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9422a189-13b4-4335-aaed-f430d0792a65")
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
    @objid ("37deb5c6-04a1-4de5-b352-f0ce269ec069")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0b590c5a-c376-4f85-905c-fc794d027c37")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9d184f0c-2cfa-482d-b97f-ce71cd418698")
    protected ProfileAssociationFeaturesSpecClientServerPortClientServerSpecification(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f5d48e0d-dcef-438c-b7d3-3bcf24c20ccc")
    public static final class MdaTypes {
        @objid ("1a9fdc5a-e9c0-4146-ad4f-eeee84638853")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f6400e5e-4474-4deb-9a34-b64a9b9f1a6d")
        private static Stereotype MDAASSOCDEP;

        @objid ("1db0c890-79e7-418f-8508-78e36b8a31dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4fee17ba-0aea-44dd-a034-48d7f6ef58d0")
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
