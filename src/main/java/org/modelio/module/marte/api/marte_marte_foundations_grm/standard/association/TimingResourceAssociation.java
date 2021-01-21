/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << TimingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5c82bbd1-7242-4446-8f9c-29553bacb6cd")
public class TimingResourceAssociation extends ResourceAssociation {
    @objid ("d66d5982-3e64-495e-8c09-43a996e7e57d")
    public static final String STEREOTYPE_NAME = "TimingResource_Association";

    /**
     * Tells whether a {@link TimingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TimingResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a80454df-f841-402d-8b4c-dc4d206a8ac1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << TimingResource_Association >> then instantiate a {@link TimingResourceAssociation} proxy.
     * 
     * @return a {@link TimingResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("9b9cb960-36d3-46de-a699-fcfc3f9b98ab")
    public static TimingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceAssociation.STEREOTYPE_NAME);
        return TimingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceAssociation} proxy from a {@link Association} stereotyped << TimingResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link TimingResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("52b31b50-15ac-4e64-8ec9-e6979841c48d")
    public static TimingResourceAssociation instantiate(final Association obj) {
        return TimingResourceAssociation.canInstantiate(obj) ? new TimingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceAssociation} proxy from a {@link Association} stereotyped << TimingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link TimingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ef94fc3b-0728-4fc0-b5ee-9d85cf6e3185")
    public static TimingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TimingResourceAssociation.canInstantiate(obj))
        	return new TimingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("TimingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f03ec630-103e-4c18-8463-18e0a246e0e5")
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
        TimingResourceAssociation other = (TimingResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("a4dbba35-600b-496c-bb8f-3a32541932b3")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("e12ea844-2515-49e9-ba74-bf096163a01b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a67a5bf5-455c-4ba6-8600-45242c7449a6")
    protected TimingResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("ef61fc71-065d-451c-884a-8dd0b3d4e76a")
    public static final class MdaTypes {
        @objid ("39fecbd0-0c60-4e73-86f1-150b7d65e5d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9695ccd-7b99-48ec-8c04-c88d7188d433")
        private static Stereotype MDAASSOCDEP;

        @objid ("08c84aad-9389-49bc-9aeb-3639f4a72914")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44dbbb7d-6d9d-40c7-a498-c7896b2c2552")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4994521d-0f4b-11df-8c52-0014222a9f79");
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
