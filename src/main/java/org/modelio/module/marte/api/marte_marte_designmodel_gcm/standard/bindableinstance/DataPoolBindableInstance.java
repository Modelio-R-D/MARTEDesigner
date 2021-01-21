/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance;

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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << DataPool_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("047c2738-f575-4334-bd37-490d1be8e3e9")
public class DataPoolBindableInstance {
    @objid ("6e2ceee2-2b65-4b6b-ae37-3e3c7b72ddb8")
    public static final String STEREOTYPE_NAME = "DataPool_BindableInstance";

    @objid ("1143bce9-91a6-48d6-936e-074229d7202a")
    public static final String DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE = "DataPool_BindableInstance_insertion";

    @objid ("5f347914-31f2-4740-9478-6cc7d1d60b18")
    public static final String DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE = "DataPool_BindableInstance_ordering";

    @objid ("cb9ba093-f1f1-41ef-8222-4bfa4738e0b7")
    public static final String DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE = "DataPool_BindableInstance_selection";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    @objid ("5231e0fc-0fb2-42a4-9fd4-0a20c8cef0b8")
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link DataPoolBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << DataPool_BindableInstance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a7568a59-8051-4923-864a-8fa35fc46ead")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << DataPool_BindableInstance >> then instantiate a {@link DataPoolBindableInstance} proxy.
     * 
     * @return a {@link DataPoolBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("428f4ad2-78ca-41f6-9011-5573fe94f410")
    public static DataPoolBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolBindableInstance.STEREOTYPE_NAME);
        return DataPoolBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolBindableInstance} proxy from a {@link BindableInstance} stereotyped << DataPool_BindableInstance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link DataPoolBindableInstance} proxy or <i>null</i>.
     */
    @objid ("ada2b930-bab3-4b69-97c9-339175796163")
    public static DataPoolBindableInstance instantiate(final BindableInstance obj) {
        return DataPoolBindableInstance.canInstantiate(obj) ? new DataPoolBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPoolBindableInstance} proxy from a {@link BindableInstance} stereotyped << DataPool_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link DataPoolBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9d4d215-2387-4331-814d-24419ec0f1a3")
    public static DataPoolBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (DataPoolBindableInstance.canInstantiate(obj))
        	return new DataPoolBindableInstance(obj);
        else
        	throw new IllegalArgumentException("DataPoolBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("41f6d3dd-3f29-4c94-be44-302c0a69e0ff")
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
        DataPoolBindableInstance other = (DataPoolBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DataPool_BindableInstance_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0a6c988-fcf8-45a4-a209-68d9e486e33d")
    public String getDataPool_BindableInstance_insertion() {
        return this.elt.getTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_BindableInstance_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("224b6e6e-358a-4a12-bf61-5c8731b5f9aa")
    public String getDataPool_BindableInstance_ordering() {
        return this.elt.getTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_BindableInstance_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5812e360-89e8-45db-9ae4-26902885aee8")
    public String getDataPool_BindableInstance_selection() {
        return this.elt.getTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    @objid ("eeeb58ed-2436-4c43-8fa7-3ad29c36b5fd")
    public BindableInstance getElement() {
        return this.elt;
    }

    @objid ("3c477302-0b78-4c16-856d-4b3f1b726a49")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'DataPool_BindableInstance_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef10cfad-d493-472e-afa9-ebdd9ca73352")
    public void setDataPool_BindableInstance_insertion(final String value) {
        this.elt.putTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_BindableInstance_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9a4116c-27ae-4e49-9b9d-7a72a550d59e")
    public void setDataPool_BindableInstance_ordering(final String value) {
        this.elt.putTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_BindableInstance_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ad89d42-713a-4868-b8bf-6fec106d0eb6")
    public void setDataPool_BindableInstance_selection(final String value) {
        this.elt.putTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE_ELT, value);
    }

    @objid ("ed97235a-2773-4eae-a8b9-f524ca49937e")
    protected DataPoolBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    @objid ("e537ed2e-9bd1-4a53-a0cd-59e0c90fd877")
    public static final class MdaTypes {
        @objid ("416b196d-3ce9-4493-806a-e048b37b6a1a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e91c7352-e6b9-48d0-89cf-2ceada1831a5")
        public static TagType DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE_ELT;

        @objid ("2dbc9081-02f8-484a-b4cc-21d296da3273")
        public static TagType DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE_ELT;

        @objid ("f54f4d6e-1847-477c-9953-c0bc102cb1a0")
        public static TagType DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE_ELT;

        @objid ("61665035-96f2-41c5-a218-320522bf00e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("81f1c279-ccff-4065-ba1c-7062da108d42")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cd3dcf69-075c-48d7-b8da-af7e1e6e772b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02644251-0ccf-11df-8525-001302895b2b");
            DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644255-0ccf-11df-8525-001302895b2b");
            DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644259-0ccf-11df-8525-001302895b2b");
            DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264425d-0ccf-11df-8525-001302895b2b");
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
