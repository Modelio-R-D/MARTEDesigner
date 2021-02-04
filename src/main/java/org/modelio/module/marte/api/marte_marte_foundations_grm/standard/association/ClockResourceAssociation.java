/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Association} with << ClockResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c9a8b0c9-3cc3-4778-a031-fb69603bf900")
public class ClockResourceAssociation extends TimingResourceAssociation {
    @objid ("0ed67c25-9442-4f1f-bdbf-04cc97034173")
    public static final String STEREOTYPE_NAME = "ClockResource_Association";

    /**
     * Tells whether a {@link ClockResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << ClockResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("83ceb4a2-11e1-487e-b4f2-8c6220e24249")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << ClockResource_Association >> then instantiate a {@link ClockResourceAssociation} proxy.
     * 
     * @return a {@link ClockResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("cb8eafc7-73b8-4a17-a1eb-761209bd0e5f")
    public static ClockResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAssociation.STEREOTYPE_NAME);
        return ClockResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceAssociation} proxy from a {@link Association} stereotyped << ClockResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ClockResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("26dc1724-2adb-44e9-8481-75f308aa6903")
    public static ClockResourceAssociation instantiate(final Association obj) {
        return ClockResourceAssociation.canInstantiate(obj) ? new ClockResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceAssociation} proxy from a {@link Association} stereotyped << ClockResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ClockResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d22a1190-28e0-4167-89f5-7dd17c4bb94f")
    public static ClockResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ClockResourceAssociation.canInstantiate(obj))
        	return new ClockResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ClockResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6acd61e-bc28-4374-ab1f-373a42dffe1c")
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
        ClockResourceAssociation other = (ClockResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("ea5a1cfe-824c-42cf-b441-434a4d089ed8")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("237ccc46-28dc-43fa-8370-01d5b74178b3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("06f955ce-0132-40e9-867e-5661f6c2abaa")
    protected ClockResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("ea05b396-190f-4f97-82dc-711f802854d8")
    public static final class MdaTypes {
        @objid ("21a04d43-2ee4-41c0-ad50-18c82f44f54b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec521bb9-f982-4e2f-8bc3-0dc4b04fbd12")
        private static Stereotype MDAASSOCDEP;

        @objid ("b9f8421c-bf1b-47f5-8d2c-06bf4e804aa3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("741ef697-4432-45f5-acae-4241b147f927")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1d8f0cfb-0f43-11df-8c52-0014222a9f79");
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
