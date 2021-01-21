/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("a09de09d-18c8-454f-94ae-f65b9ec62fb2")
    public static final String STEREOTYPE_NAME = "LinkTopology_Connector";

    /**
     * The underlying {@link Connector} represented by this proxy, never null.
     */
    @objid ("db925c50-0c83-4fa9-ba7a-8ef010b6e009")
    protected final Connector elt;

    /**
     * Tells whether a {@link LinkTopologyConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << LinkTopology_Connector >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0f85f3a4-1aca-450b-9f8c-fc4cd72e34b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, LinkTopologyConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << LinkTopology_Connector >> then instantiate a {@link LinkTopologyConnector} proxy.
     * 
     * @return a {@link LinkTopologyConnector} proxy on the created {@link Connector}.
     */
    @objid ("208afc5e-fb97-4be3-bfe9-d6f9b71d4cca")
    public static LinkTopologyConnector create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Connector");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, LinkTopologyConnector.STEREOTYPE_NAME);
        return LinkTopologyConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link LinkTopologyConnector} proxy from a {@link Connector} stereotyped << LinkTopology_Connector >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link LinkTopologyConnector} proxy or <i>null</i>.
     */
    @objid ("b8aeac24-bcc1-432a-854a-bfc249f63d89")
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
    @objid ("2b980d10-134c-48d0-97b0-ca502a5f7c07")
    public static LinkTopologyConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (LinkTopologyConnector.canInstantiate(obj))
        	return new LinkTopologyConnector(obj);
        else
        	throw new IllegalArgumentException("LinkTopologyConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7460b8e5-e309-422c-9b7c-5f4ed952ca6b")
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
    @objid ("4ec25ba7-cf5c-43e2-a596-2e7ca51ccb33")
    public Connector getElement() {
        return this.elt;
    }

    @objid ("4260bb38-6c97-4a3a-bc15-f34ffee65e8f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5289075f-97f6-4f44-b434-f302ee79f2f1")
    protected LinkTopologyConnector(final Connector elt) {
        this.elt = elt;
    }

    @objid ("b86750c0-adab-46e8-b86c-79c9e6037cde")
    public static final class MdaTypes {
        @objid ("00e1ef93-59d7-4783-a87b-f6aad4ecf2ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("927e3c94-72af-47ef-a143-086790f1f2de")
        private static Stereotype MDAASSOCDEP;

        @objid ("6c8c3c62-1dd9-482a-848d-4da4ca9715ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28fb007f-8262-426f-b512-b1758c3edb64")
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
