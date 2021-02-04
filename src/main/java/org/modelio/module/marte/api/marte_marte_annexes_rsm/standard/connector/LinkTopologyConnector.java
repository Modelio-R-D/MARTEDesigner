/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector;

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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << LinkTopology_Connector >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e12aeaa4-2cc3-4fb4-a862-2382edd699a9")
public class LinkTopologyConnector {
    @objid ("b368d122-1787-428c-8d69-2f41d56f2e25")
    public static final String STEREOTYPE_NAME = "LinkTopology_Connector";

    /**
     * The underlying {@link Connector} represented by this proxy, never null.
     */
    @objid ("c9fa9330-c733-4349-8fb9-241a92b5e9bb")
    protected final Connector elt;

    /**
     * Tells whether a {@link LinkTopologyConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << LinkTopology_Connector >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("eef73120-5d0a-4c20-9ca3-29f9caafe771")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, LinkTopologyConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << LinkTopology_Connector >> then instantiate a {@link LinkTopologyConnector} proxy.
     * 
     * @return a {@link LinkTopologyConnector} proxy on the created {@link Connector}.
     */
    @objid ("3e0be1a6-fac7-4470-9b62-df5dfee48a84")
    public static LinkTopologyConnector create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, LinkTopologyConnector.STEREOTYPE_NAME);
        return LinkTopologyConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link LinkTopologyConnector} proxy from a {@link Connector} stereotyped << LinkTopology_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link LinkTopologyConnector} proxy or <i>null</i>.
     */
    @objid ("8d83e575-f779-447f-bab9-d8765993cf81")
    public static LinkTopologyConnector instantiate(final Connector obj) {
        return LinkTopologyConnector.canInstantiate(obj) ? new LinkTopologyConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LinkTopologyConnector} proxy from a {@link Connector} stereotyped << LinkTopology_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link LinkTopologyConnector} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2928016b-b252-4c43-95fe-546ae29fc01e")
    public static LinkTopologyConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (LinkTopologyConnector.canInstantiate(obj))
        	return new LinkTopologyConnector(obj);
        else
        	throw new IllegalArgumentException("LinkTopologyConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dad66133-1ba2-4a07-9e45-61f45dcbac1e")
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
        LinkTopologyConnector other = (LinkTopologyConnector) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("941e0fdf-5bdf-4ab2-b741-dcfdb53454f7")
    public Connector getElement() {
        return this.elt;
    }

    @objid ("11ca2958-d8c9-4c20-afc9-b2ddd72fa118")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b23e190b-de07-4dd9-ad23-5dbbeb158cbb")
    protected LinkTopologyConnector(final Connector elt) {
        this.elt = elt;
    }

    @objid ("b86750c0-adab-46e8-b86c-79c9e6037cde")
    public static final class MdaTypes {
        @objid ("6df5c57f-6b15-4029-b0f5-8e14c4022d30")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2d36a995-e4dc-433b-aef3-ce07ee18b691")
        private static Stereotype MDAASSOCDEP;

        @objid ("b67b8512-9532-4b7a-9876-9c0ed9f00af1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e3898d6-9956-4b3f-bf77-c2c33a058d6b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d367b6-0ccf-11df-8525-001302895b2b");
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
