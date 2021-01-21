/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << StorageResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("130a3a39-5e96-479d-aa9b-96b4065448a2")
public class StorageResourceLink extends ResourceLink {
    @objid ("d08381d5-1cba-467e-8207-ebecd1774d1e")
    public static final String STEREOTYPE_NAME = "StorageResource_Link";

    @objid ("3a469046-afee-4010-ad5d-e75af7608719")
    public static final String STORAGERESOURCE_LINK_ELEMENTSIZE_TAGTYPE = "StorageResource_Link_elementSize";

    /**
     * Tells whether a {@link StorageResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << StorageResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4d96d875-977c-46bb-9754-ded83422ded9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << StorageResource_Link >> then instantiate a {@link StorageResourceLink} proxy.
     * 
     * @return a {@link StorageResourceLink} proxy on the created {@link Link}.
     */
    @objid ("8894f9b4-e30e-4a04-ad98-b1e127c9fcdf")
    public static StorageResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceLink.STEREOTYPE_NAME);
        return StorageResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceLink} proxy from a {@link Link} stereotyped << StorageResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link StorageResourceLink} proxy or <i>null</i>.
     */
    @objid ("e32d02c5-b387-4803-9da1-e74a0cc18997")
    public static StorageResourceLink instantiate(final Link obj) {
        return StorageResourceLink.canInstantiate(obj) ? new StorageResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceLink} proxy from a {@link Link} stereotyped << StorageResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link StorageResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("52178cc2-2761-4fb7-ad8c-f79a1458828b")
    public static StorageResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (StorageResourceLink.canInstantiate(obj))
        	return new StorageResourceLink(obj);
        else
        	throw new IllegalArgumentException("StorageResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("43d7a04d-cf83-4155-8a0e-785147f72d0c")
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
        StorageResourceLink other = (StorageResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("0b216ebc-0ee7-40f2-8fc6-e74ee847a367")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a90f3b11-2ae0-4218-8ab6-98a6b9bee0e4")
    public String getStorageResource_Link_elementSize() {
        return this.elt.getTagValue(StorageResourceLink.MdaTypes.STORAGERESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("f01fc8fa-96e1-4908-be5f-a2c96f2c1af2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Link_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8cc0976-3cc6-4615-ae75-c11b7b2d077e")
    public void setStorageResource_Link_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceLink.MdaTypes.STORAGERESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("e5575a6e-712e-45a9-9f19-3a029ae4d7b1")
    protected StorageResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("2bd90136-aa8e-4b04-84ee-f7adb6f702f6")
    public static final class MdaTypes {
        @objid ("964700b8-cefc-47c0-9376-44c391370735")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("40d8e6a6-65c2-468f-83c4-876a90fbe98e")
        public static TagType STORAGERESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("21e1c540-0a49-41f2-9b1e-8687d51d22b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("b3688247-df0b-46d0-a34a-b661396f6eab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f15a5c40-bf9e-4678-b2a5-1e86e41f01e6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa29393-0cce-11df-8525-001302895b2b");
            STORAGERESOURCE_LINK_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5d4-0cce-11df-8525-001302895b2b");
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
