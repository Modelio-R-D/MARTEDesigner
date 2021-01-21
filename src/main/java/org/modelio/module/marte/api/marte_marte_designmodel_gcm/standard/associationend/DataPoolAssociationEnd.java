/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << DataPool_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("761da933-85c4-42dd-a157-fa908dfefa27")
public class DataPoolAssociationEnd {
    @objid ("07d82f1d-6671-40e0-a324-c0c6ad939705")
    public static final String STEREOTYPE_NAME = "DataPool_AssociationEnd";

    @objid ("b3c341b8-cb2a-42f5-ace7-55e474d246ae")
    public static final String DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE = "DataPool_AssociationEnd_insertion";

    @objid ("7802efcc-0b2e-4491-b91a-218e561e97bd")
    public static final String DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE = "DataPool_AssociationEnd_ordering";

    @objid ("b9234b25-b422-41c1-b89a-6967d4ea0699")
    public static final String DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE = "DataPool_AssociationEnd_selection";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("fdf21ca1-1b6b-4ab8-a840-f1c897520e22")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link DataPoolAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b0868690-18bc-415c-93e0-b5832aad88e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >> then instantiate a {@link DataPoolAssociationEnd} proxy.
     * 
     * @return a {@link DataPoolAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("72de492e-8ca1-4778-8e54-8231ca384f65")
    public static DataPoolAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAssociationEnd.STEREOTYPE_NAME);
        return DataPoolAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link DataPoolAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("a968d77d-0508-4675-83c5-9a3910e4e478")
    public static DataPoolAssociationEnd instantiate(final AssociationEnd obj) {
        return DataPoolAssociationEnd.canInstantiate(obj) ? new DataPoolAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPoolAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link DataPoolAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7649352b-bfbf-44d9-b824-cfdba6cfc93b")
    public static DataPoolAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (DataPoolAssociationEnd.canInstantiate(obj))
        	return new DataPoolAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("DataPoolAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1c36b35e-f72f-449f-b69a-7e964eb1b792")
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
        DataPoolAssociationEnd other = (DataPoolAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DataPool_AssociationEnd_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a7ce354a-896b-4960-bd76-a81e6eae73b5")
    public String getDataPool_AssociationEnd_insertion() {
        return this.elt.getTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_AssociationEnd_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("800bd553-f0ee-4127-bc9f-a0033f1e01ed")
    public String getDataPool_AssociationEnd_ordering() {
        return this.elt.getTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_AssociationEnd_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("34d636bc-4582-4fda-aa96-151d347e9878")
    public String getDataPool_AssociationEnd_selection() {
        return this.elt.getTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("3d36cbb1-3089-4604-975c-fd5b26790358")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("1d69177b-0a7b-4e9d-8cae-2e3919163645")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'DataPool_AssociationEnd_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d202dc51-b88c-438e-ba9b-75ef4738ae14")
    public void setDataPool_AssociationEnd_insertion(final String value) {
        this.elt.putTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_AssociationEnd_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("952b6fcf-3921-453d-9a7f-af1906726231")
    public void setDataPool_AssociationEnd_ordering(final String value) {
        this.elt.putTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_AssociationEnd_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f714bb4-8c5e-4f59-9851-51d817f49b67")
    public void setDataPool_AssociationEnd_selection(final String value) {
        this.elt.putTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT, value);
    }

    @objid ("3f88c7c2-0902-472e-b06c-2dd62e43a6a1")
    protected DataPoolAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("746262ce-ae6f-4d94-ad3d-0e18aa0bad40")
    public static final class MdaTypes {
        @objid ("fb7ce4c5-545e-43dc-9974-f1debc7a0e15")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("46c31852-d9e1-4725-923e-59043c779674")
        public static TagType DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT;

        @objid ("1523c807-8d11-476c-84fe-f1ff407b764c")
        public static TagType DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT;

        @objid ("49653b19-07d3-47b5-8fac-2dcf448a4533")
        public static TagType DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT;

        @objid ("dd286153-6de5-4ea5-9f8b-6df17bd487dd")
        private static Stereotype MDAASSOCDEP;

        @objid ("d06763ce-015e-453c-80c7-a01c866f5a48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("03777028-b803-42f1-bb2f-f82f1b3b9600")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02644250-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644254-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644258-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264425c-0ccf-11df-8525-001302895b2b");
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
