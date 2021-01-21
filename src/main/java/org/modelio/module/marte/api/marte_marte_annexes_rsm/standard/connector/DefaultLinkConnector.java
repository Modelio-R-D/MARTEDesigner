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
 * Proxy class to handle a {@link Connector} with << DefaultLink_Connector >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("705b661b-c9cc-46f0-bedd-3f20131245fa")
public class DefaultLinkConnector extends LinkTopologyConnector {
    @objid ("d01d2807-8224-42d9-b6ed-ff226aa2798b")
    public static final String STEREOTYPE_NAME = "DefaultLink_Connector";

    /**
     * Tells whether a {@link DefaultLinkConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << DefaultLink_Connector >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("07d59dc6-07fc-45e7-9481-8b47061bffbb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DefaultLinkConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << DefaultLink_Connector >> then instantiate a {@link DefaultLinkConnector} proxy.
     * 
     * @return a {@link DefaultLinkConnector} proxy on the created {@link Connector}.
     */
    @objid ("2c3668f9-02b9-408a-999d-9406a9e711e9")
    public static DefaultLinkConnector create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Connector");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DefaultLinkConnector.STEREOTYPE_NAME);
        return DefaultLinkConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link DefaultLinkConnector} proxy from a {@link Connector} stereotyped << DefaultLink_Connector >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link DefaultLinkConnector} proxy or <i>null</i>.
     */
    @objid ("0b05ba86-617f-4ec8-b022-5f2b30195548")
    public static DefaultLinkConnector instantiate(final Connector obj) {
        return DefaultLinkConnector.canInstantiate(obj) ? new DefaultLinkConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DefaultLinkConnector} proxy from a {@link Connector} stereotyped << DefaultLink_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link DefaultLinkConnector} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("363ededb-7bcd-4c36-9b53-f8b45d571201")
    public static DefaultLinkConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (DefaultLinkConnector.canInstantiate(obj))
        	return new DefaultLinkConnector(obj);
        else
        	throw new IllegalArgumentException("DefaultLinkConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b8c734a4-981b-4735-aa13-cb6ecfb5d263")
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
        DefaultLinkConnector other = (DefaultLinkConnector) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("510b0565-6f86-4ba0-96eb-8a36d72de8d5")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    @objid ("fa88f8c3-9c43-4425-9838-0b5cf05aa735")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0fb43181-3d8b-4f47-b609-c11b70457a9a")
    protected DefaultLinkConnector(final Connector elt) {
        super(elt);
    }

    @objid ("35cc4ec3-913c-48b2-bffa-313923d435ff")
    public static final class MdaTypes {
        @objid ("7650ff9e-c76c-4e02-b221-c0d844108315")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e7b2c2f-38ea-49f5-975d-7c070f64717e")
        private static Stereotype MDAASSOCDEP;

        @objid ("c09fdda7-a584-4861-817a-fbb2c8c1657f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e752444a-ddbf-4322-bb4e-c199d70d3a55")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d367b7-0ccf-11df-8525-001302895b2b");
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
