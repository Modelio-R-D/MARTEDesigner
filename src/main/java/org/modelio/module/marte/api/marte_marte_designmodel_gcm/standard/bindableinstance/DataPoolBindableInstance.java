/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class DataPoolBindableInstance {
    public static final String STEREOTYPE_NAME = "DataPool_BindableInstance";

    public static final String DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE = "DataPool_BindableInstance_insertion";

    public static final String DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE = "DataPool_BindableInstance_ordering";

    public static final String DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE = "DataPool_BindableInstance_selection";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link DataPoolBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << DataPool_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << DataPool_BindableInstance >> then instantiate a {@link DataPoolBindableInstance} proxy.
     * 
     * @return a {@link DataPoolBindableInstance} proxy on the created {@link BindableInstance}.
     */
    public static DataPoolBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolBindableInstance.STEREOTYPE_NAME);
        return DataPoolBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolBindableInstance} proxy from a {@link BindableInstance} stereotyped << DataPool_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link DataPoolBindableInstance} proxy or <i>null</i>.
     */
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
    public static DataPoolBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (DataPoolBindableInstance.canInstantiate(obj))
        	return new DataPoolBindableInstance(obj);
        else
        	throw new IllegalArgumentException("DataPoolBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public String getDataPool_BindableInstance_insertion() {
        return this.elt.getTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_BindableInstance_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_BindableInstance_ordering() {
        return this.elt.getTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_BindableInstance_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_BindableInstance_selection() {
        return this.elt.getTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    public BindableInstance getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'DataPool_BindableInstance_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_BindableInstance_insertion(final String value) {
        this.elt.putTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_BindableInstance_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_BindableInstance_ordering(final String value) {
        this.elt.putTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_BindableInstance_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_BindableInstance_selection(final String value) {
        this.elt.putTagValue(DataPoolBindableInstance.MdaTypes.DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE_ELT, value);
    }

    protected DataPoolBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DATAPOOL_BINDABLEINSTANCE_ORDERING_TAGTYPE_ELT;

        public static TagType DATAPOOL_BINDABLEINSTANCE_INSERTION_TAGTYPE_ELT;

        public static TagType DATAPOOL_BINDABLEINSTANCE_SELECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
